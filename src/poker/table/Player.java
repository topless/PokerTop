/*
 *
 */
package poker.table;

import java.util.List;

import poker.dealer.Card;

/**
 * A poker player.
 */
public/* @ nullable_by_default @ */class Player {

    /** The is active. */
    public boolean isActive;

    /** The bank. */
    private double bank;

    /** The cards. */
    private List<Card> cards;

    /** The name. */
    private final String name;

    /**
     * Instantiates a new player.
     * 
     * @param newName
     *            the new name
     */
    // @ ensures name == newName;
    public/* @ pure @ */Player(/* @ non_null @ */String newName, /* @ non_null @ */double initAmount) {
        name = newName;
        bank = initAmount;
    }

    // @ requires bank >= 0;
    // @ ensures \result == bank ;
    /**
     * Gets the bank amount.
     * 
     * @return the bank amount
     */
    private/* @ pure @ */double getBank() {
        return this.bank;
    }

    // @ ensures \result == name;
    /**
     * Gets the name.
     * 
     * @return the name
     */
    public/* @ pure @ */String getName() {
        return this.name;
    }

    // @ requires value >= 0;
    // @ assignable bank;
    // @ ensures bank == \old(get_bank_amount) + value;
    /**
     * Adds the to bank.
     * 
     * @param value_to_add
     *            the value_to_add
     */
    public final void addToBank(double value) {
        setBank(getBank() + value);
    }

    // @ assignable bank;
    // @ requires is_active;
    /**
     * Call.
     */
    public void call() {
    }

    // @ requires is_active; ensures cards . count == 0; ensures ! is_active;
    /**
     * Fold.
     */
    public void fold() {
    }

    // @ assignable bank; requires is_active; requires raise_bet >= 0;

    /**
     * Raise.
     * 
     * @param raiseBet
     *            the raise bet
     */
    public void raise(double raiseBet) {
    }

    // @ requires cards . count >= 0;
    /**
     * Show cards.
     */
    public void showCards() {
    }

    // @ requires is_active;
    // @ ensures cards . count == 2;
    /**
     * Stay.
     */
    public void stay() {
    }

    // @ requires value >= 0;
    // @ requires value <= bank;
    // @ ensures bank == \old(bank) - value;
    /**
     * Subtract from bank.
     * 
     * @param value
     *            the value we subtract from bank.
     */
    public final void subtractFromBank(final double value) {
        setBank(getBank() - value);
    }

    public final void setBank(double bank) {
        this.bank = bank;
    }

    // @ invariant cards . count >= 0;
    // @ invariant cards . count <= 2;
    // @ invariant 0 <= get_bank_amount;
}
