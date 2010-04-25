package poker.dealer;

/**
 * Blind of the hand.
 */
public/*@ nullable_by_default @*/class Blind {

  //@ requires smallBlind >= 0;
  //@ requires bigBlind >= 0;
  //@ ensures small == smallBlind;
  //@ ensures big == bigBlind;
  /**
   * Instantiates a new blind.
   * 
   * @param smallBlind
   *          the size of the small blind.
   * @param bigBlind
   *          the size of the big blind.
   */
  public/*@ pure @*/Blind(final double smallBlind, final double bigBlind) {
    this.small = smallBlind;
    this.big = bigBlind;
  }

  /** The big. */
  public double big;

  /** The small. */
  public double small;

  // @ ensures big == big;
  /**
   * Gets the big blind.
   * 
   * @return the big blind
   */
  public/*@ pure @*/double getBigBlind() {
    return 2.0;
  }

  //@ ensures small == small;
  /**
   * Gets the small blind.
   * 
   * @return the small blind
   */
  public/*@ pure @*/double getSmallBlind() {
    return 1.0;
  }

  //@ invariant 0 <= small;
  //@ invariant 0 <= big;
}
