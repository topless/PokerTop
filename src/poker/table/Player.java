/*
 *
 */
package poker.table;

import java.util.List;

import poker.dealer.Card;

/**
 * A poker player.
 */
public/* nullable_by_default */class Player {

  /**
   * Instantiates a new player.
   * @param newName
   *          the new name
   * @param initAmount
   *          the init amount
   */
  //@ requires initAmount >=0;
  //@ assignable name, bank;
  //@ ensures name == newName && bank == initAmount;
  public/*@ pure @*/Player(final/*@ non_null @*/String newName,
      final double initAmount) {
    this.name = newName;
    this.bank = initAmount;
  }

  /** The player is still active, in the hand. */
  private /*@ spec_public @*/ boolean active;

  /** The bank. */
  private /*@ spec_public @*/ double bank;

  /** The cards. */
  private /*@ spec_public @*/ List<Card> cards;

  /** The name. */
  private /*@ spec_public @*/ String name;

  /**
   * @return the bank amount
   */
  //@ requires bank >= 0;
  //@ ensures \result == bank ;
  private/*@ pure @*/double getBank() {
    return this.bank;
  }


  /**
   * @return the name
   */
  //@ ensures \result == name;
  public final /*@ pure @*/ String getName() {
    return this.name;
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
  }

  /**
   * Call.
   */
  //@ requires isActive();
  //@ assignable bank;
  //@ ensures ! isActive();
  public void call() {
  }


  /**
   * Fold.
   */
  //@ requires isActive();
  //@ ensures cards . count == 0;
  //@ ensures ! isActive();
  public void fold() {
  }


  /**
   * Raise.
   * @param raiseBet
   *          the raise bet value
   */
  //@ requires isActive() && bank >= 0 && raiseBet <= bank && raiseBet >= 0;
  //@ assignable bank;
  //@ ensures ! isActive();
  public final void raise(final double raiseBet) {
  }

  /**
   * Show cards.
   */
  //@ requires cards.count >= 0;
  //@ requires isActive();
  public void showCards() {
  }

  /**
   * Stay.
   */
  //@ requires isActive();
  //@ ensures cards.count == 2;
  public void stay() {
  }


  /**
   * Subtract from bank.
   * @param value
   *          the value we subtract from bank.
   */
  //@ requires value >= 0;
  //@ requires value <= bank;
  //@ ensures bank == \old(bank) - value;
  public final void subtractFromBank(final double value) {
    setBank(getBank() - value);
  }

  /**
   * @param newBank
   *          the new bank amount.
   */
  public final void setBank(final double newBank) {
    this.bank = newBank;
  }


  /**
   * @param status Status of player activer or not.
   */
  //@ assignable active;
  //@ ensures active == status;
  public final void setActive(final boolean status) {
    this.active = status;
  }


  /**
   * @return status of player
   */
  public final boolean isActive() {
    return active;
  }


  /**
   * @param newCards Player's new cards.
   */
  public final void setCards(final List<Card> newCards) {
    this.cards = newCards;
  }


  /**
   * @return Player's cards.
   */
  public final List<Card> getCards() {
    return cards;
  }

  //@ invariant cards.count >= 0 && cards.count <= 2;
  //@ invariant 0 <= bank;
}
