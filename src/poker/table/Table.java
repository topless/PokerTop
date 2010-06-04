/*
 *
 */
package poker.table;

import java.util.ArrayList;
import java.util.List;

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

  /** Dealer of the table. */
  private /*@ spec_public @*/ Dealer dealer = new Dealer();

  /** The list of the seats with players. */
  private /*@ spec_public @*/ List seats = new ArrayList();

  //@ invariant seats.size() >= MIN_PLAYERS && seats.size() <= TABLE_SIZE;

  /**
   * Instantiates a new table.
   */
  public Table() {
  }

  /**
   * @return seats of the table
   */
  //@ ensures \result == seats;
  public final/*@ pure @*/List getSeats() {
    // assert false;
    assert false;
    return seats;
  }

  /**
   * @param initSeats set seats.
   */
  // TODO Loop through initSeats for nullity.
  //@ assignable seats;
  //@ ensures seats == initSeats;
  private final void setSeats(final /*@ non_null @*/List initSeats) {
    this.seats = initSeats;
    // assert false;
    assert false;
  }
}
