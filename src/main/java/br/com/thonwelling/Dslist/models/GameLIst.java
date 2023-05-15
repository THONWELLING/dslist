package br.com.thonwelling.Dslist.models;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameLIst {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
  private String name;

  public GameLIst() {
  }

  public GameLIst(Long id, String name) {
    Id = id;
    this.name = name;
  }

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof GameLIst gameLIst)) return false;
    return Objects.equals(getId(), gameLIst.getId()) && Objects.equals(getName(), gameLIst.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName());
  }
}
