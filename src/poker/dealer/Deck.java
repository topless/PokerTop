/*
 * Deck.java
 */
package poker.dealer;

import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Deck of all the cards.
 */
public/* @ nullable_by_default @ */class Deck {

    // @ ensures deck . count == 52;
    /**
     * Instantiates a new deck.
     */
    public/* @ pure @ */Deck() {
    }

    /** The cards deck. */
    public Set<Card> cardsDeck;

    // @ ensures deck == deck;
    // public /*@ pure @*/ Deck get_deck(){
    // }

    // @ ensures deck . count == \old(deck . count) - 3;
    /**
     * Deal flop.
     */
    public void dealFlop() {
    }

    // @ assignable deck;
    // @ requires deck . count == 52;
    /**
     * Deal players.
     */
    public void dealPlayers() {
    }

    // @ ensures deck . count == \old(deck . count) - 1;
    /**
     * Deal river.
     */
    public void dealRiver() {
    }

    // @ ensures deck . count == \old(deck . count) - 1;
    /**
     * Deal turn.
     */
    public void dealTurn() {
    }

    // @ requires deck . count == 52;
    /**
     * Shuffle deck.
     */
    public void shuffleDeck() {
    }

    // @ invariant deck . count <= 52;
    // @ invariant deck . count >= 0;
}
