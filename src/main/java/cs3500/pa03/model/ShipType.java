package cs3500.pa03.model;

/**
 * Represents a single ship in a game of BattleSalvo.
 */
public enum ShipType {
  CARRIER(6),
  BATTLESHIP(5),
  SUBMARINE(3),
  DESTROYER(4);

  private final int size;

  /**
   * Constructor for ShipType
   *
   * @param size the size of the ship
   */
  ShipType(int size) {
    this.size = size;
  }

  /**
   * Returns the size of the ship
   *
   * @return size
   */
  public int getSize() {
    return size;
  }

  public String getSymbol() {
    return switch (this) {
      case CARRIER -> " C ";
      case BATTLESHIP -> " B ";
      case SUBMARINE -> " S ";
      case DESTROYER -> " D ";
      default -> null;
    };
  }
}
