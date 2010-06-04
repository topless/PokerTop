/*
 * Deck.java
 */
package poker.dealer;


/**
 * Deck of all the cards.
 */
public/* nullable_by_default */class Deck {

  /**
   * Number of cards of a full deck.
   */
  public static final int FULL_DECK = 52;

  /**
   * Minimum number of players.
   */
  public static final int MIN_PLAYERS = 2;


  /** All the cards of the deck. */
  private /*@ spec_public non_null @*/ Card[] allCards = new Card[FULL_DECK];

  //@ public invariant 0 <= allCards.length & allCards.length <= FULL_DECK;

  //TODO write code for ensures

  /**
   * Create a new Deck.
   */
  public Deck() {
  }

  /**
   * Shuffle deck.
   */
  /*@ public normal_behavior
      requires allCards.length == FULL_DECK;
      assignable allCards;
      ensures allCards.length == FULL_DECK;
   */
  public final void shuffleDeck() {
    // assert false;
    assert false;
  }

  /**
   * Deal flop.
   */
  //@ assignable allCards;
  // ensures allCards.length == \old(allCards.length) - 3;
  public final void dealFlop() {
    // assert false;
    assert false;
  }

  /**
   * Deal players.
   * @param numOfPlayers Number of players to be dealt cards.
   */
  //@ requires numOfPlayers >= MIN_PLAYERS;
  //@ requires allCards.length == FULL_DECK;
  // assignable allCards;
  // ensures allCards.length == \old(allCards.length) - 1;
  public void dealPlayers(final int numOfPlayers) {
  /*for (int i=0; i<= numOfPlayers; i++ ){
    }*/
    // assert false;
    assert false;
  }

  /**
   * Deal turn.
   */
  //@ assignable allCards;
  // ensures allCards.length == \old(allCards.length) - 1;
  public void dealTurn() {
    // assert false;
    assert false;
  }

  /**
   * Deal river.
   */
  //@ assignable allCards;
  // ensures allCards.length == \old(allCards.length) - 1;
  public void dealRiver() {
    // assert false;
    assert false;
  }

  /**
   * @return all cards of the deck
   */
  //@ ensures \result == allCards;
  public final/*@ pure @*/Card[] getAllCards() {
    // assert false;
    assert false;
    return allCards;
  }

  /**
   * @param newDeckOfCards Then new deck of cards.
   */
  /*@ public normal_behavior
      requires newDeckOfCards.length == FULL_DECK;
      requires (\forall int i; 0<=i && i< newDeckOfCards.length; newDeckOfCards[i] != null);
      assignable allCards;
      ensures allCards == newDeckOfCards;
   */
  public final void setAllCards(final /*@ non_null @*/Card[] newDeckOfCards) {
    this.allCards = newDeckOfCards;
    // assert false;
    assert false;
  }
}
