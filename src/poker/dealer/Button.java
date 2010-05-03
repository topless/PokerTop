/*
 *
 */
package poker.dealer;

/**
 * The button that defines where the deal starts from.
 */
public/* nullable_by_default */class Button {

  /**
   * Instantiates a new button.
   */
  //@ ensures position == 0;
  public/* @ pure @ */Button() {
    this.position = 0;
  }

  /** The position. */
  private/*@ spec_public @*/int position;

  /**
   * Gets the position.
   *
   * @return the position
   */
  //@ ensures \result == position;
  public final int getPosition() {
    return position;
  }

  /**
   * Next dealer.
   *
   * @param newPosition the new position
   */
  //@ requires newPosition >=0;
  //@ assignable position;
  //@ ensures position == newPosition;
  public final void nextDealer(final int newPosition) {
    this.position = newPosition;
    assert false;
    //@ assert false;
  }
}
