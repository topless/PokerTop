/*
 *
 */
package poker.table;

import poker.dealer.Ante;
import poker.dealer.Blind;
import poker.dealer.Button;
import poker.dealer.Deck;
import poker.dealer.Pot;

// TODO: Auto-generated Javadoc
//import java.util.Set;

/**
 * Dealer of the table.
 */
public/* @ nullable_by_default @ */class Dealer {

    // @ requires small_blind >= 0;
    // @ requires big_blind >= 0;
    // @ requires ante_size >= 0;
    // @ ensures pot == 0;
    // @ ensures blind . get_small_blind == small_blind;
    // @ ensures blind . get_big_blind == big_blind;
    // @ ensures ante . get_ante == ante_size;
    /**
     * Instantiates a new dealer.
     * 
     * @param big_blind
     *            the big_blind
     * @param small_blind
     *            the small_blind
     * @param ante_size
     *            the ante_size
     */
    public/* @ pure @ */Dealer(double big_blind, double small_blind, double ante_size) {
    }

    /** The ante. */
    public Ante ante;

    /** The blind. */
    public Blind blind;

    /** The button. */
    public Button button;

    /** The deck. */
    public Deck deck;
    // Define enum values of game state.
    // public Set<Values> game_state;
    /** The pot. */
    public Pot pot;

    // @ invariant pot >= 0;
    // @ invariant blind . get_small_blind >= 0;
    // @ invariant blind . get_big_blind >= 0;
    // @ invariant ante . get_ante >= 0;
}
