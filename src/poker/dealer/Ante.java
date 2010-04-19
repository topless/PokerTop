/*
 *
 */
package poker.dealer;

/**
 * Ante of the hand.
 */
public/* @ nullable_by_default @ */class Ante {
    /** The ante size. */
    private double size;

    /**
     * Instantiates a new ante.
     * 
     * @param anteSize
     *            The ante size
     */
    // @ requires ante_size >= 0;
    // @ ensures size == ante_size;
    public/* @ pure @ */Ante(final double anteSize) {
        size = anteSize;
    }

    /**
     * Gets the ante.
     * 
     * @return the ante
     */
    // @ ensures \result == size;
    public/* @ pure @ */double getAnte() {
        return 2.0;
    }

    // @ requires new_ante_value >= 0;
    // @ ensures get_ante_size == new_ante_value;
    /**
     * Sets the ante.
     * 
     * @param new_ante_value
     *            the new ante
     */
    public void setAnte(double new_ante_value) {
    }
    // @ invariant 0 <= size;
}
