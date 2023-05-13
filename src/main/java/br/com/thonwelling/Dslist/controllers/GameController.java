package br.com.thonwelling.Dslist.controllers;

import br.com.thonwelling.Dslist.dto.GameDto;
import br.com.thonwelling.Dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

  @Autowired
  GameService gameService;

  @GetMapping
  public List<GameDto>getGamesList () {
    return gameService.getGamesList();
  }
}
