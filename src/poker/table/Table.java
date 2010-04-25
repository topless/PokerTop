/*
 *
 */
package poker.table;

import java.util.Set;

/**
 * A poker table.
 */
public/* @ nullable_by_default @ */class Table {

  /** The size. */
  private int size;

  // @ requires 2 <= newSize;
  // @ requires 10 >= newSize;
  // @ ensures size == newSize;
  // @ ensures getSize == newSize;
  /**
   * Instantiates a new table.
   * 
   * @param newSize
   *          Size of the table
   */
  public/* @ pure @ */Table(final int newSize) {
    // table const
    this.size = newSize;
  }

  /** The seats. */
  public Set<Seat> seats;

  // @ ensures \result == size;
  /**
   * Gets the size.
   * 
   * @return the size
   */
  public/* @ pure @ */int getSize() {
    return size;
  }

  // @ invariant seats . count >= 2;
  // @ invariant seats . count <= 10;
  // @ invariant 2 <= size;
  // @ invariant 10 >= size;
}
