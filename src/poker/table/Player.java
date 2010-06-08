/*
 * 
 */
package poker.table;

import poker.dealer.Card;
/**
 * A poker player.
 */
public/* nullable_by_default */class Player {
  /** The Constant MAX_PLAYERS_CARDS. */
  public static final int MAX_PLAYERS_CARDS = 2;


  /** The bank. */
  private/*@ spec_public @*/double bank;

  /** Player cards. */
  private/*@ spec_public @*/Card[] cards = new Card[MAX_PLAYERS_CARDS];

  /** The name. */
  private/*@ spec_public @*/int id;

  public static final Card[]  NO_CARDS = new Card[0];

  /*@ invariant id > 0;
      public invariant 0 == cards.length
                         | cards.length == MAX_PLAYERS_CARDS;
      public invariant 0 <= bank;
   */

  /**
   * Instantiates a new player.
   * @param newId
   *          player's Id
   * @param initAmount
   *          the init amount
   */
  /*@ requires newId > 0;
      requires initAmount >=0;
      assignable id, bank;
      ensures id == newId & bank == initAmount;
   */
  public Player(final int newId,
      final double initAmount) {
    this.id = newId;
    this.bank = initAmount;
  }

  /**
   * @return the bank amount
   */
  /*@ public normal_behavior
      ensures \result >= 0;
      ensures \result == bank ;
   */
  public/*@ pure @*/double getBank() {
    // assert false;
    //assert false;
    return this.bank;
  }

  /**
   * @return the name
   */
  /*@ public normal_behavior
      ensures \result > 0;
      ensures \result == id;
   */
  public final/*@ pure @*/int getId() {
    // assert false;
    //assert false;
    return this.id;
  }

  /**
   * Adds the player's bank.
   * @param value
   *          the value
   */
  /*@ public normal_behavior
      requires addValue >= 0;
      requires getBank() + addValue >= 0;
      assignable bank;
      ensures bank == \old(getBank()) + addValue;
   */
  public final void addToBank(final double addValue) {
    setBank(getBank() + addValue);
    // assert false;
    //assert false;
  }

  /**
   * Call.
   * @param betValue The value that calling costs.
   */
  /*@ public normal_behavior
      requires 0 < callValue ;
      requires 0 <= getBank() - callValue;
      assignable bank;
      ensures bank == \old(getBank()) - callValue;
   */
  public final void call(final double callValue) {
    setBank(getBank() - callValue);
    // assert false;
    //assert false;
  }

  /**
   * Fold.
   */
  /*@ public normal_behavior
      assignable cards;
   */
  public final void fold() {
    // assert false;
    //assert false;
  }

  /**
   * Raise.
   * @param betValue
   *          The value of the raise bet.
   */
  /*@ public normal_behavior
      requires 0 < betValue ;
      requires 0 <= getBank() - betValue;
      assignable bank;
      ensures bank == \old(getBank()) - betValue;
   */
  public final void raise(final double betValue) {
    setBank(getBank() - betValue);
    // assert false;
    //assert false;
  }

  /**
   * Show cards.
   */
  /*@ public normal_behavior
      requires cards.length == MAX_PLAYERS_CARDS;
      requires NO_CARDS.length == 0;
      assignable cards;
      ensures cards.length == 0;
   */
  public final void showCards() {
    setCards(NO_CARDS);
    // assert false;
    //assert false;
  }

  /**
   * Stay.
   */
  /*@ public normal_behavior
      requires cards.length == MAX_PLAYERS_CARDS;
      ensures cards.length == MAX_PLAYERS_CARDS;
   */
  public final/*@ pure @*/void stay() {
    // assert false;
    //assert false;
  }

  /**
   * Subtract from bank.
   * @param value
   *          the value we subtract from bank.
   */
  public final void subtractFromBank(final double value) {
    //setBank(getBank() - value);
    // assert false;
    //assert false;
  }

  /**
   * @param newBank the new bank amount.
   */
  /*@ requires newBank >= 0;
      assignable bank;
      ensures bank == newBank;
   */
  public final void setBank(final double newBank) {
    this.bank = newBank;
    // assert false;
    //assert false;
  }

  /**
   * @param newCards Player's new cards.
   */
  /*@ requires 0 == newCards.length | newCards.length == MAX_PLAYERS_CARDS;
      assignable cards;
      ensures cards == newCards;
   */
  public final void setCards(final /*@ non_null @*/ Card[] newCards) {
    this.cards = newCards;
    // assert false;
    //assert false;
  }

  /**
   * @return Player's cards.
   */
  //@ ensures \result == cards;
  public final/*@ pure @*/Card[] getCards() {
    // assert false;
    //assert false;
    return cards;
  }
}
