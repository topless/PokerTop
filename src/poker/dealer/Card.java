/*
 *
 */
package poker.dealer;


/**
 * A card of the deck.
 */

public/* nullable_by_default */class Card {

  /**
   * Instantiates a new card.
   * @param cardRank
   *          Rank of the card.
   * @param cardSuit
   *          Suit of the card.
   */
   //@ public normal_behavior
   //@ requires 2 <= cardRank;
   //@ requires 14 >= cardRank;
   //@ requires 0 <= cardSuit;
   //@ requires 3 >= cardSuit;
   //@ ensures rank == cardRank;
   //@ ensures suit == cardSuit;
  public/*@ pure @*/Card(final int cardRank, final int cardSuit) {
    this.rank = cardRank;
    this.suit = cardSuit;
  }

  /** The suit. */
  private /*@ spec_public @*/ int suit;

  /** The value. */
  private /*@ spec_public @*/ int rank;

  /**
   * @param newRank the new value
   */
  //@ requires newRank >=2 && newRank <= 14;
  //@ assignable rank;
  //@ ensures rank == newRank;
  public final void setRank(final int newRank) {
    this.rank = newRank;
  }

  /**
   * @return the rank of card
   */
  //@ ensures \result == rank;
  public final int getRank() {
    return this.rank;
  }

  /**
   * @param newSuit the new suit
   */
  //@ requires newSuit >=0 && newSuit <= 3;
  //@ assignable suit;
  //@ ensures suit == newSuit;
  public final void setSuit(final int newSuit) {
    suit = newSuit;
  }

  /**
   * @return the suit
   */
  //@ ensures \result == suit;
  public final int getSuit() {
    return suit;
  }

  // invariant 1 <= rank;
  // invariant 14 >= rank;
  // invariant 0 <= suit;
  // invariant 3 >= suit;
  static class Suit {
    static final int CLUBS = 0;
    static final int DIAMONDS = 1;
    static final int HEARTS = 2;
    static final int SPADES = 3;
  }

  static class Rank {
    static final int DEUCE = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    static final int SIX = 6;
    static final int SEVEN = 7;
    static final int EIGHT = 8;
    static final int NINE = 9;
    static final int TEN = 10;
    static final int JACK = 11;
    static final int QUEEN = 12;
    static final int KING = 13;
    static final int ACE = 14;
  }
}

