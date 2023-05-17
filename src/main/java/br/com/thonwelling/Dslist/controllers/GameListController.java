package br.com.thonwelling.Dslist.controllers;

import br.com.thonwelling.Dslist.dto.GameCompleteDto;
import br.com.thonwelling.Dslist.dto.GameDto;
import br.com.thonwelling.Dslist.dto.GameListDto;
import br.com.thonwelling.Dslist.services.GameListService;
import br.com.thonwelling.Dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

  @Autowired
  GameListService gameListService;
  @Autowired
  GameService gameService;

  @GetMapping
  public List<GameListDto>getGamesList () {
    return gameListService.getGamesList();
  }

  @GetMapping("/{listId}/games")
  public List<GameDto>findByLIst (@PathVariable Long listId) {
    return gameService.findGameByList(listId);
  }

}
