package cs3500.pa03.model;

/**
 * Represents a single coordinate on a BattleSalvo board.
 */
public class Coord {
  private int x; // x coordinate
  private int y; // y coordinate

  /**
   * Constructor for Coord
   *
   * @param x the x coordinate
   * @param y the y coordinate
   */
  public Coord(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Returns the x coordinate
   *
   * @return x
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y coordinate
   *
   * @return y
   */
  public int getY() {
    return this.y;
  }

  /**
   * Overrides the equals method to compare two Coord objects
   *
   * @param o the object to compare
   * @return true if the objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (o instanceof Coord) {
      Coord c = (Coord) o;
      return this.x == c.x && this.y == c.y;
    } else {
      return false;
    }
  }
}
