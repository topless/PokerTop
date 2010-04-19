/*
 *
 */
package poker.dealer;

// TODO: Auto-generated Javadoc
/**
 * Blind of the hand.
 */
public/* @ nullable_by_default @ */class Blind {

    // @ requires small_size >= 0;
    // @ requires big_size >= 0;
    // @ ensures small == small_size;
    // @ ensures big == big_size;
    /**
     * Instantiates a new blind.
     * 
     * @param small_size
     *            the small_size
     * @param big_size
     *            the big_size
     */
    public/* @ pure @ */Blind(double small_size, double big_size) {
    }

    /** The big. */
    public double big;

    /** The small. */
    public double small;

    // @ ensures big == big;
    /**
     * Gets the big blind.
     * 
     * @return the big blind
     */
    public/* @ pure @ */double getBigBlind() {
        return 2.0;
    }

    // @ ensures small == small;
    /**
     * Gets the small blind.
     * 
     * @return the small blind
     */
    public/* @ pure @ */double getSmallBlind() {
        return 1.0;
    }

    // @ invariant 0 <= small;
    // @ invariant 0 <= big;
}
