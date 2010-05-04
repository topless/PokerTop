/*
 */
package poker.dealer;

/**
 * Blind of the hand.
 */
public/* nullable_by_default */class Blind {

  /**
   * Creates a new blind.
   * @param smallBlind
   *          the size of the small blind.
   * @param bigBlind
   *          the size of the big blind.
   * @param anteSize
   *          the size of ante.
   */
  //@ public normal_behavior
  //@ requires smallBlind >= 0 && bigBlind >= 0 && ante >=0;
  //@ assignable small, big, ante;
  //@ ensures small == smallBlind;
  //@ ensures big == bigBlind;
  //@ ensures ante == anteSize;
  public Blind(final double smallBlind, final double bigBlind,
      final double anteSize) {
    this.small = smallBlind;
    this.big = bigBlind;
    this.ante = anteSize;
  }

  /** The big. */
  private/*@ spec_public @*/double big;

  /** The small. */
  private/*@ spec_public @*/double small;

  /** The ante. */
  private/*@ spec_public @*/double ante;

  /**
   * Gets the ante.
   *
   * @return the ante
   */
  //@ ensures 0 <= \result;
  //@ ensures ante == \result;
  public final double getAnte() {
    return ante;
  }

  /**
   * Sets the ante.
   *
   * @param newAnte the new ante
   */
  //@ requires newAnte >= 0;
  //@ assignable ante;
  //@ ensures ante == newAnte;
  public final void setAnte(final double newAnte) {
    this.ante = newAnte;
    //@ assert false;
  }

  /**
   * Gets the big.
   *
   * @return the big blind
   */
  //@ ensures 0 <= \result;
  //@ ensures big == \result;
  public final double getBig() {
    return big;
  }

  /**
   * Sets the big.
   *
   * @param newBig the new value of big blind.
   */
  //@ requires newBig >= 0;
  //@ assignable big;
  //@ ensures big == newBig;
  public final void setBig(final double newBig) {
    this.big = newBig;
    //@ assert false;
  }

  /**
   * Gets the small.
   *
   * @return the small
   */
  //@  ensures 0 <= \result;
  //@  ensures small == \result;
  public final double getSmall() {
    return small;
  }

  /**
   * Sets the small.
   *
   * @param newSmall the new small blind value
   */
  //@ requires newSmall >= 0;
  //@ assignable small;
  //@ ensures small == newSmall;
  public final void setSmall(final double newSmall) {
    this.small = newSmall;
    //@ assert false;
  }

  //@ invariant 0 <= small && 0 <= big && ante >= 0;
}
