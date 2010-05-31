/*
 *
 */
package poker.dealer;

/**
 * The button that defines where the deal starts from.
 */
public/* nullable_by_default */class Button {

  /** The position. */
  private /*@ spec_public @*/ int position;

  /**
   * Instantiates a new button.
   */
  //@ assignable position;
  //@ ensures position == 0;
  public Button() {
    this.position = 0;
  }

  /**
   * @return the position
   */
  //@ ensures \result == position;
  public final/*@ pure @*/int getPosition() {
    //@ assert false;
    assert false;
    return position;
  }

  /**
   * @param newPosition the new position
   */
  //@ requires newPosition >=0;
  //@ assignable position;
  //@ ensures position == newPosition;
  public final void setPosition(final int newPosition) {
    this.position = newPosition;
    //@ assert false;
    assert false;
  }
  /**
   * Next dealer.
   * @param currentPosition the new position
   */
  public final/*@ pure @*/void nextDealer(final int currentPosition) {
    //TODO table calculations to find next valid position.
    //@ assert false;
    assert false;
  }
}
