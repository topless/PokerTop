/*
 * Dealer.java
 */
package poker.table;

import poker.dealer.Blind;
import poker.dealer.Button;
import poker.dealer.Deck;
import poker.dealer.Pot;

/**
 * Dealer of the table.
 */
/* nullable_by_default */class Dealer {

  /**
   * Instantiates a new dealer.
   */
  public/*@ pure @*/Dealer() {
    /*this.blind = new Blind(0, 0, 0);
    this.button = new Button();
    this.deck = new Deck();
    this.pot = new Pot(0);*/
  }

  /** The blind. */
  /*@ spec_public @*/private Blind blind;

  /** The button. */
  /*@ spec_public @*/private Button button;

  /** The deck. */
  /*@ spec_public @*/private Deck deck;

  /** The pot. */
  /*@ spec_public @*/private Pot pot;

}
