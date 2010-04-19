/*
 *
 */
package poker.dealer;

/**
 * Pot of the table.
 */
public/* @ nullable_by_default @ */class Pot {

    // @ ensures size == 0;
    /**
     * Instantiates a new pot.
     */
    public/* @ pure @ */Pot() {
        size = 0;
    }

    /** The Pot size. */
    private double size;

    // @ requires newSize >= 0;
    // @ assignable size;
    // @ ensures \result >= 0;
    /**
     * Sets the pot size.
     * 
     * @param newSize
     *            the new size
     * @params new size value.
     */
    public void setSize(double newSize) {
        this.size = newSize;
    }

    // @ ensures \result == size;
    /**
     * Gets the pot size.
     * 
     * @return the pot size
     */
    public final/* @ pure @ */double getSize() {
        return size;
    }

    // @ requires addedValue >= 0;
    // @ ensures size == \old(size) + addedValue;
    /**
     * Adds the value to pot size.
     * 
     * @param addedValue
     *            the added value
     */
    public void addToPotSize(final double addedValue) {
        setSize(addedValue + getSize());
    }
    // @ invariant 0 <= size;
}
