/*
 *
 */
package poker.dealer;

/**
 * The button that defines where the deal starts from.
 */
public/* nullable_by_default */class Button {
  /** The position. */
  private /*@ spec_public @*/int position;

  /**
   * Instantiates a new button.
   */
  //@ ensures position == 0;
  public/* @ pure @ */Button() {
    this.position = 0;
  }

  //@ ensures \result == position;
  /**
   * Gets the position.
   *
   * @return the position
   */
  public final int getPosition() {
    return position;
  }
  
  //@ requires newPosition >=0;
  //@ assignable position;
  //@ ensures position == newPosition;
  /**
   * Sets the position.
   *
   * @param newPosition the new position
   */
  public final void setPosition(final int newPosition) {
    this.position = newPosition;
  }
}
