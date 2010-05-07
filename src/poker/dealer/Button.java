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
  private /*@ spec_public @*/ int position;

  /**
   * @return the position
   */
  //@ ensures \result == position;
  public final int getPosition() {
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
  }
  /**
   * Next dealer.
   * @param currentPosition the new position
   */
  public final void nextDealer(final int currentPosition) {
    //TODO table calculations to find next valid position.
  }


}
