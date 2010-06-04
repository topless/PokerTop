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

  /** The Constant MIN_PLAYERS_CARDS. */
  public static final int MIN_PLAYERS_CARDS = 0;

  /** If player is still involved in the hand. */
  private/*@ spec_public @*/boolean active;

  /** The bank. */
  private/*@ spec_public @*/double bank;

  /** Player cards. */
  private/*@ spec_public @*/Card[] cards = new Card[2];

  /** The name. */
  private/*@ spec_public @*/int id;

  //@ invariant MIN_PLAYERS_CARDS <= cards.length & cards.length <= MAX_PLAYERS_CARDS;
  //@ invariant 0 <= bank;

  /**
   * Instantiates a new player.
   * @param newId
   *          player's Id
   * @param initAmount
   *          the init amount
   */
  //@ requires initAmount >=0 && id >=0;
  //@ assignable id, bank;
  //@ ensures id == newId && bank == initAmount;
  public Player(final int newId,
      final double initAmount) {
    this.id = newId;
    this.bank = initAmount;
  }

  /**
   * @return the bank amount
   */
  //@ requires bank >= 0;
  //@ ensures \result == bank ;
  private/*@ pure @*/double getBank() {
    // assert false;
    assert false;
    return this.bank;
  }

  /**
   * @return the name
   */
  //@ ensures \result == id;
  public final/*@ pure @*/int getId() {
    // assert false;
    assert false;
    return this.id;
  }

  /**
   * Adds the player's bank.
   * @param value
   *          the value
   */
  //@ requires value >= 0;
  //@ assignable bank;
  //@ ensures bank == \old(bank) + value;
  public final void addToBank(final double value) {
    setBank(getBank() + value);
    // assert false;
    assert false;
  }

  /**
   * Call.
   * @param betValue The value that calling costs.
   */
  /*@ requires isActive();
      requires betValue >= 0;
      requires betValue <= bank;
      assignable bank;
      ensures bank == \old(bank) - betValue;
   */
  public final void call(final double betValue) {
    setBank(getBank() - betValue);
    // assert false;
    assert false;
  }

  /**
   * Fold.
   */
  /*@ requires isActive();
      assignable active;
      ensures cards.length == 0;
      ensures ! isActive();
   */
  public final void fold() {
    setActive(false);
    // assert false;
    assert false;
  }

  /**
   * Raise.
   * @param betValue
   *          The value of the raise bet.
   */
  /*@ requires isActive() && bank >= 0 && betValue <= bank && betValue >= 0;
      assignable bank;
      ensures bank == \old(bank) - betValue;
   */
  public final void raise(final double betValue) {
    setBank(getBank() - betValue);
    // assert false;
    assert false;
  }

  /**
   * Show cards.
   */
  /*@ requires cards.length >= 0;
      requires isActive();
      assignable cards, active;
      ensures cards.length == 0;
      ensures ! isActive();
   */   
  public final void showCards() {
    setActive(false);
    // assert false;
    assert false;
  }

  /**
   * Stay.
   */
  //@ requires isActive();
  //@ ensures cards.length == MAX_PLAYERS_CARDS;
  public final/*@ pure @*/void stay() {
    // assert false;
    assert false;
  }

  /**
   * Subtract from bank.
   * @param value
   *          the value we subtract from bank.
   */

  public final void subtractFromBank(final double value) {
    setBank(getBank() - value);
    // assert false;
    assert false;
  }

  /**
   * @param newBank the new bank amount.
   */
  //@ requires newBank >= 0;
  //@ assignable bank;
  public final void setBank(final double newBank) {
    this.bank = newBank;
    // assert false;
    assert false;
  }

  /**
   * @param status Status of player in hand or not.
   */
  //@ assignable active;
  //@ ensures active == status;
  public final void setActive(final boolean status) {
    this.active = status;
    // assert false;
    assert false;
  }

  /**
   * Checks if is still active in current hand.
   * @return status of player
   */
  //@ ensures \result == active;
  public/*@ pure @*/final boolean isActive() {
    // assert false;
    assert false;
    return active;
  }

  /**
   * @param newCards Player's new cards.
   */
  //@ requires newCards != null;
  //@ assignable cards;
  //@ ensures cards == newCards;
  public final void setCards(final Card[] newCards) {    
    this.cards = newCards;
    // assert false;
    assert false;
  }

  /**
   * @return Player's cards.
   */
  //@ ensures \result == cards;
  public final/*@ pure @*/Card[] getCards() {
    // assert false;
    assert false;
    return cards;
  }
}
