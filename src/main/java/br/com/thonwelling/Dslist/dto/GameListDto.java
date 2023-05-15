package br.com.thonwelling.Dslist.dto;

import br.com.thonwelling.Dslist.models.GameLIst;

public class GameListDto {

  private Long id;
  private String name;

  public GameListDto() {
  }

  public GameListDto(GameLIst entity) {
    id = entity.getId();
    name = entity.getName();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
