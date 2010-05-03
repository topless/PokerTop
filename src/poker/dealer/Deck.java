/*
 * Deck.java
 */
package poker.dealer;

import java.util.LinkedList;

/**
 * Deck of all the cards.
 */
public/* nullable_by_default */class Deck {

  /** All the cards of the deck. */
  /*@ spec_public @*/private LinkedList allCards;

  /**
   * Number of cards of a full deck.
   */
  public static final int FULL_DECK = 52;

  /**
   * Shuffle deck.
   */
  //@ requires allCards.size() == FULL_DECK;
  //@ assignable allCards;
  //@ ensures allCards.size() == FULL_DECK;
  public final void shuffleDeck() {
    //Collections.shuffle(allCards);
    assert false;
    //@ assert false;
  }

  /**
   * Deal flop.
   */
  //@ ensures allCards.size() == \old(allCards.size()) - 3;
  public final void dealFlop() {
    assert false;
    //@ assert false;
  }

  /**
   * Deal players.
   * @param numOfPlayers number of players to be dealt cards.
   */
  //@ requires numOfPlayers >= 2;
  //@ requires allCards.size() == FULL_DECK;
  //@ assignable allCards;
  public final void dealPlayers(final int numOfPlayers) {
    assert false;
    //@ assert false;
  }

  /**
   * Deal turn.
   */
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public final void dealTurn() {
    assert false;
    //@ assert false;
  }

  /**
   * Deal river.
   */
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public final void dealRiver() {
    assert false;
    //@ assert false;
  }

  /**
   * Gets the all cards.
   *
   * @return all cards of the deck
   */
  //@ ensures \result == allCards;
  public final LinkedList getAllCards() {
    return allCards;
  }

  /**
   * Sets the all cards.
   *
   * @param newDeckOfCards Then new deck of cards.
   */
  //@ requires newDeckOfCards != null;
  //@ ensures allCards == newDeckOfCards;
  public final void setAllCards(final LinkedList newDeckOfCards) {
    this.allCards = newDeckOfCards;
    assert false;
    //@ assert false;
  }

  //@ invariant allCards.size() <= FULL_DECK && allCards.size() >= 0;
}
