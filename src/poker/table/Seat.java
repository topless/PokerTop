/*
 *
 */
package poker.table;

/**
 * Representation of a seat at the table.
 */
public/* nullable_by_default */class Seat {

  /** The position. */
  private /*@ spec_public @*/ int position;

  /** Player Id that occupies the specific seat. */
  private /*@ spec_public @*/ int playerId;

  //@ private invariant position >= 0;
  //@ private invariant playerId >= 0;

  /**
   * Instantiates a new seat.
   * @param initPosition
   *          The starting position of dealer button.
   */
  //@ requires initPosition >= 0;
  //@ ensures position == initPosition;
  public Seat(final int initPosition) {
    this.position = initPosition;
  }

  /**
   * @return Player Id;
   */
  public final/*@ pure @*/int getPlayerId() {
    //@ assert false;
    assert false;
    return playerId;
  }

  /**
   * @param pid Player's id to be assigned.
   */
  //@ requires pid >= 0;
  //@ assignable playerId;
  //@ ensures playerId == pid;
  public final void setPlayerId(final int pid) {
    this.playerId = pid;
    //@ assert false;
    assert false;
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
}
