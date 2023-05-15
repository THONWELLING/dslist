package br.com.thonwelling.Dslist.services;

import br.com.thonwelling.Dslist.dto.GameCompleteDto;
import br.com.thonwelling.Dslist.dto.GameDto;
import br.com.thonwelling.Dslist.dto.GameListDto;
import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.models.GameLIst;
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

  @Transactional(readOnly = true)
  public List<GameListDto> getGamesList() {
    List<GameLIst> result =gameListRepository.findAll();
    return result.stream().map(GameListDto::new).collect(Collectors.toList());
  }

}
