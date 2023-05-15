package br.com.thonwelling.Dslist.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {
  @ManyToOne
  @JoinColumn(name = "game_id")
  private Game game;

  @ManyToOne
  @JoinColumn(name = "list_id")
  private GameLIst gameLIst;

  public BelongingPK() {
  }

  public BelongingPK(Game game, GameLIst gameLIst) {
    this.game = game;
    this.gameLIst = gameLIst;
  }

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public GameLIst getGameLIst() {
    return gameLIst;
  }

  public void setGameLIst(GameLIst gameLIst) {
    this.gameLIst = gameLIst;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof BelongingPK that)) return false;
    return Objects.equals(getGame(), that.getGame()) && Objects.equals(getGameLIst(), that.getGameLIst());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getGame(), getGameLIst());
  }
}
