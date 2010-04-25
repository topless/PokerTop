/*
 *
 */
package poker.dealer;

/**
 * A card of the deck.
 */
public/* @ nullable_by_default @ */class Card {

  // @ requires 1 <= card_value;
  // @ requires 13 >= card_value;
  // @ requires 1 <= card_suit;
  // @ requires 4 >= card_suit;
  // @ ensures value == card_value;
  // @ ensures suit == card_suit;
  /**
   * Instantiates a new card.
   * 
   * @param card_value
   *          the card_value
   * @param card_suit
   *          the card_suit
   */
  public/* @ pure @ */Card(int card_value, int card_suit) {
  }

  /** The suit. */
  public int suit;

  /** The value. */
  public int value;

  // @ invariant 1 <= value;
  // @ invariant 13 >= value;
  // @ invariant 1 <= suit;
  // @ invariant 4 >= suit;
}
