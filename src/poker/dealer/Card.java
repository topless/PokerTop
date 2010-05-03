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

  /** The Constant MIN_SUIT. */
  public static final int MIN_SUIT = 0;

  /** The Constant MAX_SUIT. */
  public static final int MAX_SUIT = 3;

  /** The Constant MIN_RANK. */
  public static final int MIN_RANK = 2;

  /** The Constant MAX_RANK. */
  public static final int MAX_RANK = 14;

  /** The suit. */
  private/*@ spec_public @*/int suit;

  /** The value. */
  private/*@ spec_public @*/int rank;

  /**
   * Sets the rank.
   *
   * @param newRank the new value
   */
  //@ requires newRank >=2 && newRank <= 14;
  //@ assignable rank;
  //@ ensures rank == newRank;
  public final void setRank(final int newRank) {
    this.rank = newRank;
    assert false;
    //@ assert false;
  }

  /**
   * Gets the rank.
   *
   * @return the rank of card
   */
  //@ ensures \result == rank;
  public final int getRank() {
    return this.rank;
  }

  /**
   * Sets the suit.
   *
   * @param newSuit the new suit
   */
  //@ requires newSuit >=0 && newSuit <= 3;
  //@ assignable suit;
  //@ ensures suit == newSuit;
  public final void setSuit(final int newSuit) {
    suit = newSuit;
    assert false;
    //@ assert false;
  }

  /**
   * Gets the suit.
   *
   * @return the suit
   */
  //@ ensures \result == suit;
  public final int getSuit() {
    return suit;
  }

  //public invariant MIN_RANK <= rank && MAX_RANK >= rank;
  //public invariant MIN_SUIT <= suit && MAX_SUIT >= suit;
 static class Suit {
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;
  }

 static class Rank {
    public static final int DEUCE = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;
  }
}
