/*
 * Deck.java
 */
package poker.dealer;

import java.util.LinkedList;

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
  public static final int MIN_NUM_OF_PLAYERS = 2;

  /** All the cards of the deck. */
  //TODO Define list type <Card> JMLc error too many parametes ???
  /*@ spec_public @*/private LinkedList allCards;

  /**
   * Shuffle deck.
   */
  //@ requires allCards.size() == FULL_DECK;
  //@ assignable allCards;
  //@ ensures allCards.size() == FULL_DECK;
  public final void shuffleDeck() {
    //Collections.shuffle(allCards);
  }

  /**
   * Deal flop.
   */
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 3;
  public final void dealFlop() {
  }

  /**
   * Deal players.
   * @param numOfPlayers Number of players to be dealt cards.
   */
  //@ requires numOfPlayers >= MIN_NUM_OF_PLAYERS;
  //@ requires allCards.size() == FULL_DECK;
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public final void dealPlayers(final int numOfPlayers) {
    /*for (int i=0; i<= numOfPlayers; i++ ){
      allCards.pop();
      allCards.pop();
    }*/
  }

  /**
   * Deal turn.
   */
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public final void dealTurn() {
    //allCards.pop();
  }

  /**
   * Deal river.
   */
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public final void dealRiver() {
    //allCards.pop();
  }

  /**
   * @return all cards of the deck
   */
  // ensures \result == allCards;
  public final LinkedList getAllCards() {
    return allCards;
  }

  /**
   * @param newDeckOfCards Then new deck of cards.
   */
  //@ requires newDeckOfCards != null;
  //@ assignable allCards;
  //@ ensures allCards == newDeckOfCards;
  public final void setAllCards(final LinkedList newDeckOfCards) {
    this.allCards = newDeckOfCards;
  }

  //@ invariant allCards.size() <= FULL_DECK && allCards.size() >= 0;
}
