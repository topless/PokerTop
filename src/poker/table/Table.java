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
   * Instantiates a new table.
   * @param newSize
   *          Size of the table
   */
  public/*@ pure @*/Table(final int newSize) {
  }

  /**
   * Constant max table size.
   */
  public static final int TABLE_SIZE = 10;

  /** The seats. */
  /*@ spec_public @*/ List seats = new ArrayList();

  //@ public invariant seats.size() >= 2 && seats.size() <= 10;
}
