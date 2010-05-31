/*
 * Deck.java
 */
package poker.dealer;

import java.util.ArrayList;

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
  private /*@ spec_public non_null @*/ ArrayList allCards;

  //@ invariant allCards.size() <= FULL_DECK && allCards.size() >= 0;


  /**
   * Create a new Deck.
   */
  public Deck() {
  }

  /**
   * Shuffle deck.
   */
  //@ requires allCards.size() == FULL_DECK;
  //@ assignable allCards;
  //@ ensures allCards.size() == FULL_DECK;
  public final void shuffleDeck() {
    //Collections.shuffle(allCards);
    //@ assert false;
    assert false;
  }

  /**
   * Deal flop.
   */
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 3;
  public final void dealFlop() {
    //@ assert false;
    assert false;
  }

  /**
   * Deal players.
   * @param numOfPlayers Number of players to be dealt cards.
   */
  //@ requires numOfPlayers >= MIN_NUM_OF_PLAYERS;
  //@ requires allCards.size() == FULL_DECK;
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public void dealPlayers(final int numOfPlayers) {
  /*for (int i=0; i<= numOfPlayers; i++ ){
      allCards.pop();
      allCards.pop();
    }*/
    //@ assert false;
    assert false;
  }

  /**
   * Deal turn.
   */
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public void dealTurn() {
    //allCards.pop();
    //@ assert false;
    assert false;
  }

  /**
   * Deal river.
   */
  //@ assignable allCards;
  //@ ensures allCards.size() == \old(allCards.size()) - 1;
  public void dealRiver() {
    //allCards.pop();
    //@ assert false;
    assert false;
  }

  /**
   * @return all cards of the deck
   */
  //@ ensures \result == allCards;
  public final/*@ pure @*/ArrayList getAllCards() {
    //@ assert false;
    assert false;
    return allCards;
  }

  /**
   * @param newDeckOfCards Then new deck of cards.
   */
  //@ assignable allCards;
  //@ ensures allCards == newDeckOfCards;
  private void setAllCards(final ArrayList newDeckOfCards) {
    this.allCards = newDeckOfCards;
    //@ assert false;
    assert false;
  }
}
