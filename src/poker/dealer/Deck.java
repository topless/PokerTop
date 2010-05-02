/*
 * Deck.java
 */
package poker.dealer;

import java.util.Collections;
import java.util.List;
/**
 * Deck of all the cards.
 */
public/* nullable_by_default */class Deck {

  /** All the cards of the deck. */
  /*@ spec_public @*/ List allCards;

  /**
   * @return number of cards of the deck.
   */
  public final int count() {
    return getAllCards().size();
  }

  /**
   * Deal flop.
   */
  //@ ensures allCards.size() == \old(allCards.size()) - 3;
  public void dealFlop() {

  }


  /**
   * Deal players.
   */
  //@ requires allCards.size() == 52;
  //@ assignable allCards;
  public void dealPlayers() {
  }

  /**
   * Deal river.
   */
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public void dealRiver() {
  }


  /**
   * Deal turn.
   */
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public void dealTurn() {
  }


  /**
   * Shuffle deck.
   */
  //@ requires allCards.size() == 52;
  //@ assignable allCards;
  //@ ensures allCards.size() == 52;
  public final void shuffleDeck() {
    Collections.shuffle(allCards);
  }

  /**
   * @return all cards of the deck
   */
  //@ ensures \result == allCards;
  public final List getAllCards() {
    return allCards;
  }

  /**
   * @param newDeckOfCards Then new deck of cards.
   */
  //@ requires newDeckOfCards != null;
  //@ ensures allCards == newDeckOfCards;
  public final void setAllCards(final List newDeckOfCards) {
    this.allCards = newDeckOfCards;
  }

  //@ invariant allCards.size() <= 52;
  //@ invariant allCards.size() >= 0;
}
