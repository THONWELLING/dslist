package br.com.thonwelling.Dslist.dto;

import br.com.thonwelling.Dslist.models.Game;
import org.springframework.beans.BeanUtils;

public class GameCompleteDto {
  private Long id;
  private String title;
  private Integer year;
  private String genre;
  private String platforms;
  private Double score;
  private String imgUrl;
  private String shortDescription;
  private String longDescription;


  public GameCompleteDto() {
  }

  /**
   * Posso passar para o Contrutor um Game como tributo, já que os atributos do DTO serão os mesmos atributos que contem na classe Game
   * E ao invés de instanciar atributo por atributa dentro do contrutor eu posso usar uma classe utilitáti do framework a BeanUtils
   * */
  public GameCompleteDto(Game entity) {
    BeanUtils.copyProperties(entity, this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getPlatforms() {
    return platforms;
  }

  public void setPlatforms(String platforms) {
    this.platforms = platforms;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }
}
