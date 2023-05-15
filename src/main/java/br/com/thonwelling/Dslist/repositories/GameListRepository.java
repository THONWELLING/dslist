package br.com.thonwelling.Dslist.repositories;

import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.models.GameLIst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameLIst, Long> {

}
