package br.com.thonwelling.Dslist.repositories;

import br.com.thonwelling.Dslist.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
