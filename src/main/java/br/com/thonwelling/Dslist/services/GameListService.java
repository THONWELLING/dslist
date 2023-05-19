package br.com.thonwelling.Dslist.services;

import br.com.thonwelling.Dslist.dto.GameCompleteDto;
import br.com.thonwelling.Dslist.dto.GameDto;
import br.com.thonwelling.Dslist.dto.GameListDto;
import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.models.GameLIst;
import br.com.thonwelling.Dslist.projections.GameMinProjection;
import br.com.thonwelling.Dslist.repositories.GameListRepository;
import br.com.thonwelling.Dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {
  @Autowired
  GameListRepository gameListRepository;
  @Autowired
  GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameListDto> getGamesList() {
    List<GameLIst> result =gameListRepository.findAll();
    return result.stream().map(GameListDto::new).collect(Collectors.toList());
  }

  @Transactional
  public void moveGame (Long listId, int originIndex, int destinationIndex) {
    List<GameMinProjection> list = gameRepository.searchByList(listId);
    GameMinProjection object = list.remove(originIndex);
    list.add(destinationIndex, object);

    int minimum = Math.min(originIndex, destinationIndex);
    int maximum = Math.max(originIndex, destinationIndex);

    for (int i = minimum; i <= maximum; i++) {
      gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    }

  }
}
