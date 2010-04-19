/*
 *
 */
package poker.dealer;

// TODO: Auto-generated Javadoc
/**
 * The button that defines where the deal starts from.
 */
public/* @ nullable_by_default @ */class Button {
    /** The position. */
    private int position;

    /**
     * Instantiates a new button.
     */
    // @ ensures position == 0;
    public/* @ pure @ */Button() {
        // const comment
        position = 0;
    }

    // @ assignable position;
    /**
     * Next player.
     */
    public final void nextPlayer() {
        position++;
    }
}
