package br.com.thonwelling.Dslist.services;

import br.com.thonwelling.Dslist.dto.GameDto;
import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService  {
  @Autowired
  GameRepository gameRepository;

  public List<GameDto> getGamesList() {
    List<Game> result =gameRepository.findAll();
    return result.stream().map(GameDto::new).collect(Collectors.toList());
  }

}
