/*
 * Dealer.java
 */
package poker.table;

import poker.dealer.Blind;
import poker.dealer.Button;
import poker.dealer.Deck;
import poker.dealer.Pot;

//import java.util.Set;

/**
 * Dealer of the table.
 */
public/* @ nullable_by_default @ */class Dealer {

  /** The small blind. */
  private double smallBlind;

  /** The big blind. */
  private double bigBlind;

  /** The ante. */
  private double ante;

  /**
   * Gets the ante.
   * 
   * @return the ante
   */
  public final double getAnte() {
    return ante;
  }

  /**
   * Sets the ante.
   * 
   * @param newAnte
   *          the new ante
   */
  public final void setAnte(final double newAnte) {
    this.ante = newAnte;
  }

  // @ requires smallBlind >= 0;
  // @ requires bigBlind >= 0;
  // @ requires ante_size >= 0;
  // @ ensures pot == 0;
  // @ ensures getSmallBlind== smallBlind;
  // @ ensures getBigBlind == bigBlind;
  // @ ensures getAnte == ante;
  /**
   * Instantiates a new dealer.
   * 
   * @param bigBlind
   *          the big blind
   * @param smallBlind
   *          the small blind
   * @param anteSize
   *          the antesize
   */
  public/* @ pure @ */Dealer(double bigBlind, double smallBlind,
      final double anteSize) {
    this.smallBlind = smallBlind;
    this.bigBlind = bigBlind;
    this.ante = anteSize;
  }

  /**
   * Gets the small blind.
   * 
   * @return the small blind
   */
  public final double getSmallBlind() {
    return smallBlind;
  }

  /**
   * Sets the small blind.
   * 
   * @param smallBlind
   *          the new small blind
   */
  public final void setSmallBlind(double smallBlind) {
    this.smallBlind = smallBlind;
  }

  /**
   * Gets the big blind.
   * 
   * @return the big blind
   */
  public final double getBigBlind() {
    return bigBlind;
  }

  /**
   * Sets the big blind.
   * 
   * @param bigBlind
   *          the new big blind
   */
  public final void setBigBlind(double bigBlind) {
    this.bigBlind = bigBlind;
  }

  /** The blind. */
  public Blind blind;

  /** The button. */
  public Button button;

  /** The deck. */
  public Deck deck;
  // Define enum values of game state.
  // public Set<Values> game_state;
  /** The pot. */
  public Pot pot;

  // @ invariant pot >= 0;
  // @ invariant blind . get_small_blind >= 0;
  // @ invariant blind . get_big_blind >= 0;
  // @ invariant ante . get_ante >= 0;
}
