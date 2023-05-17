package br.com.thonwelling.Dslist.repositories;

import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

	/**
	 * Aqui temos um detalhe importante... Quando fazemos uma NativeQuery,
	 * o resultado dessa query tem que ser uma interface oque no Spring Chamamos de projection
	 * Onde devem ser colocados métodos GETs correspndentes a nossa conulta.
	 * */
  @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);

}