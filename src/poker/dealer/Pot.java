/*
 *
 */
package poker.dealer;

/**
 * Pot of the table.
 */
public/* nullable_by_default */class Pot {
  /** The Pot size. */
  private/*@ spec_public @*/double size;

  //@ invariant 0 <= size;

  /** Max pot size. */
  public static final double MAX_POT_SIZE = Double.MAX_VALUE;

  /**
   * Instantiates a new pot.
   * @param initSize
   *        size to initialize pot.
   */
  //@ requires initSize >= 0;
  //@ assignable size;
  //@ ensures size == initSize;
  public Pot(final double initSize) {
    this.size = initSize;
  }

  /**
   * @param newSize the new size
   */
  //@ requires newSize >= 0;
  //@ assignable size;
  //@ ensures  size == newSize;
  public final void setSize(final double newSize) {
    this.size = newSize;
    //@ assert false;
    assert false;
  }

  /**
   * @return the pot size
   */
  //@ ensures \result == size;
  public final/*@ pure @*/double getSize() {
    //@ assert false;
    assert false;
    return size;
  }

  /**
   * Adds the value to pot size.
   *
   * @param addedValue The added value to the pot.
   */
  //@ requires addedValue >= 0;
  //@ assignable size;
  //@ ensures size == \old(size) + addedValue;
  public final void addToPotSize(final double addedValue) {
    //setSize(getSize() + addedValue);
    //@ assert false;
    assert false;
  }


}