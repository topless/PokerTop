/*
 *
 */
package poker.table;

/**
 * Representation of a seat at the table.
 */
public/* nullable_by_default */class Seat {
  /**
   * Instantiates a new seat.
   * @param initPosition
   *          The starting position of dealer button.
   */
  //@ ensures position == initPosition;
  public/*@ pure @*/Seat(final int initPosition) {
    this.position = initPosition;
  }

  /** The position. */
  private /*@ spec_public @*/ int position;

  /** Player Id that occupies the specific seat. */
  private /*@ spec_public @*/ int playerId;


  /**
   * @return Player Id;
   */
  public final int getPlayerId() {
    return playerId;
  }

  /**
   * @param id Player's id to be assigned.
   */
  //@ assignable playerId;
  //@ ensures playerId == id;
  public final void setPlayerId(final int id) {
    this.playerId = id;
  }

  /**
   * @return the position
   */
  //@ ensures \result == position;
  public final/*@ pure @*/int getPosition() {
    return position;
  }

  //@ public invariant position >= 0;
  //@ public invariant playerId >= 0;
}
