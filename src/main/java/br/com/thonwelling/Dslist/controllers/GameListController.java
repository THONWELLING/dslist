package br.com.thonwelling.Dslist.controllers;

import br.com.thonwelling.Dslist.dto.GameCompleteDto;
import br.com.thonwelling.Dslist.dto.GameDto;
import br.com.thonwelling.Dslist.dto.GameListDto;
import br.com.thonwelling.Dslist.dto.ReplacementDto;
import br.com.thonwelling.Dslist.services.GameListService;
import br.com.thonwelling.Dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
  @PostMapping("/{listId}/replacement")
  public void moveGame (@PathVariable Long listId, @RequestBody ReplacementDto body) {
     gameListService.moveGame(listId, body.getOriginIndex(), body.getDestinationIndex());
  }

}
