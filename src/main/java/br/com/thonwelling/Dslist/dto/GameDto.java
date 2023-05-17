package br.com.thonwelling.Dslist.dto;

import br.com.thonwelling.Dslist.models.Game;
import br.com.thonwelling.Dslist.projections.GameMinProjection;
import jakarta.persistence.Column;

public class GameDto {
  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameDto() {
  }

  public GameDto(Game entity) {
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.year = entity.getYear();
    this.imgUrl = entity.getImgUrl();
    this.shortDescription = entity.getShortDescription();
  }
  public GameDto(GameMinProjection projection) {
    this.id = projection.getId();
    this.title = projection.getTitle();
    this.year = projection.getGameYear();
    this.imgUrl = projection.getImgUrl();
    this.shortDescription = projection.getShortDescription();
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }
}
