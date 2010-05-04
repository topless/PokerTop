/*
 *
 */
package poker.table;

import java.util.LinkedList;

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

  /** The Constant MAX_PLAYERS_CARDS. */
  public static final int MAX_PLAYERS_CARDS = 2;

  /** The Constant MIN_PLAYERS_CARDS. */
  public static final int MIN_PLAYERS_CARDS = 0;

  /** The player is still active, in the hand. */
  private/*@ spec_public @*/boolean active;

  /** The bank. */
  private/*@ spec_public @*/double bank;

  /** The cards. */
  private/*@ spec_public @*/LinkedList cards;

  /** The name. */
  private/*@ spec_public @*/String name;

  /**
   * @return the bank amount
   */
  //@ requires bank >= 0;
  //@ ensures \result == bank ;
  private/*@ pure @*/double getBank() {
    return this.bank;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  //@ ensures \result == name;
  public final/*@ pure @*/String getName() {
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
    //@ assert false;
  }

  /**
   * Call.
   */
  //@ requires isActive();
  //@ assignable bank;
  //@ ensures ! isActive();
  public final void call() {
    //@ assert false;
  }

  /**
   * Fold.
   */
  //@ requires isActive();
  //@ ensures cards.size() == 0;
  //@ ensures ! isActive();
  public final void fold() {
    //@ assert false;
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
    //@ assert false;
  }

  /**
   * Show cards.
   */
  //@ requires cards.size() >= 0;
  //@ requires isActive();
  public final void showCards() {
    //@ assert false;
  }

  /**
   * Stay.
   */
  //@ requires isActive();
  //@ ensures cards.size() == 2;
  public final void stay() {
    //@ assert false;
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
    //@ assert false;
  }

  /**
   * Sets the bank.
   *
   * @param newBank the new bank amount.
   */
  //@ requires newBank >= 0;
  //@ assignable bank;
  public final void setBank(final double newBank) {
    this.bank = newBank;
    //@ assert false;
  }

  /**
   * Sets the active.
   *
   * @param status Status of player activer or not.
   */
  //@ assignable active;
  //@ ensures active == status;
  public final void setActive(final boolean status) {
    this.active = status;
    //@ assert false;
  }

  /**
   * Checks if is active.
   *
   * @return status of player
   */
  public/*@ pure @*/final boolean isActive() {
    return active;
  }

  /**
   * Sets the cards.
   *
   * @param newCards Player's new cards.
   */
  public final void setCards(final LinkedList newCards) {
    this.cards = newCards;
    //@ assert false;
  }

  /**
   * Gets the cards.
   *
   * @return Player's cards.
   */
  public final LinkedList getCards() {
    return cards;
  }

  //@ invariant cards.size() >= MIN_PLAYERS_CARDS && cards.size() <= MAX_PLAYERS_CARDS;
  //@ invariant 0 <= bank;
}
