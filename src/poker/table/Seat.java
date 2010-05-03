/*
 *
 */
package poker.table;

/**
 * Representation of a seat at the table.
 */
public/* nullable_by_default */class Seat {
  /** The position. */
  private/*@ spec_public @*/final int position;

  /**
   * Instantiates a new seat.
   * @param newPosition
   *          the new position
   */
  //@ ensures position == newPosition;
  public/*@ pure @*/Seat(final int newPosition) {
    this.position = newPosition;
  }

  /**
   * Gets the position.
   *
   * @return the position
   */
  //@ ensures \result == position;
  public final/*@ pure @*/int getPosition() {
    return position;
  }

  //@ invariant position >=0;
}
