/*
 *
 */
package poker.table;

/**
 * Representation of a seat at the table.
 */
public/* @ nullable_by_default @ */class Seat {

    // @ ensures position == new_position;
    /**
     * Instantiates a new seat.
     * 
     * @param new_position
     *            the new_position
     */
    public/* @ pure @ */Seat(/* @ non_null @ */int new_position) {
    }

    /** The player. */
    public Player player;

    /** The position. */
    public int position;

    // @ ensures \result == player;
    // public /*@ pure @*/ Player get_player(){}

    // @ ensures \result == position;
    /**
     * Gets the position.
     * 
     * @return the position
     */
    public/* @ pure @ */int getPosition() {
        return 0;
    }

    // @ requires get_player;
    /**
     * Checks if is availiable.
     * 
     * @return true, if is availiable
     */
    public/* @ pure @ */boolean isAvailiable() {
        return false;
    }

    // @ requires get_player;
    // @ ensures ! is_availiable;
    // @ ensures get_player == new_player;
    /**
     * Sets the player.
     * 
     * @param new_player
     *            the new player
     */
    public void setPlayer(/* @ non_null @ */Player new_player) {
    }
}
