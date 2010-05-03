/*
 *
 */
package poker.dealer;

/**
 * Pot of the table.
 */
public/* nullable_by_default */class Pot {

  /**
   * Instantiates a new pot.
   * @param initSize
   *        size to initialize pot.
   */
  //@ requires initSize >= 0;
  //@ assignable this.size;
  //@ ensures this.size == initSize;
  public/*@ pure @*/Pot(final double initSize) {
    this.size = initSize;
  }

  /** The Pot size. */
  private/*@ spec_public @*/double size;

  /**
   * Sets the size.
   *
   * @param newSize the new size
   * @params new size value.
   */
  //@ requires newSize >= 0;
  //@ assignable size;
  //@ ensures  getSize() == newSize;
  public final void setSize(final double newSize) {
    this.size = newSize;
    //@ assert size == 0;
    assert size == 0;
    return;
  }

  /**
   * Gets the size.
   *
   * @return the pot size
   */
  //@ ensures \result == size;
  public final/*@ pure @*/double getSize() {
    //@ assert size == 0;
    assert size == 0;
    return size;
  }

  /**
   * Adds the to pot size.
   *
   * @param addedValue the added value to the pot
   */
  //@ requires addedValue >= 0;
  //@ assignable size;
  //@ ensures size == \old(size) + addedValue;
  public final void addToPotSize(final double addedValue) {
    setSize(getSize() + addedValue);
    //@ assert false;
    assert false;
  }

  //@ public invariant 0 <= size;
}
