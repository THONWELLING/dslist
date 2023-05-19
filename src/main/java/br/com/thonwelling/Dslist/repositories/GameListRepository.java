package br.com.thonwelling.Dslist.repositories;

import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.models.GameLIst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameLIst, Long> {

  @Modifying
  @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
  void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
