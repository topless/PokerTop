/*
 *
 */
package poker.table;

import java.util.LinkedList;

/**
 * A poker table.
 */
public/* nullable_by_default */class Table {

  /**
   * Constant table size.
   */
  public static final int TABLE_SIZE = 10;

  /**
   * Constant Minimum number of players.
   */
  public static final int MIN_PLAYERS = 2;

  /**
   * Instantiates a new table.
   */
  public/*@ pure @*/Table() {
  }

  private /*@ spec_public @*/ Dealer dealer = new Dealer();

  //TODO List<Player>
  /** The list of the seats with players. */
  private /*@ spec_public @*/ LinkedList seats = new LinkedList();

  /**
   * @return seats of the table
   */
  //@ assignable seats;
  //@ ensures \result == seats;
  public final LinkedList getSeats() {
    return seats;
  }

  /**
   * @param initSeats set seats.
   */
  // TODO Loop through initSeats for nullity.
  //@ ensures seats == initSeats;
  public final void setSeats(final LinkedList initSeats) {
    this.seats = initSeats;
  }

  //@ public invariant seats.size() >= MIN_PLAYERS && seats.size() <= TABLE_SIZE;
}
