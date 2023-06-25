package cs3500.pa03.view;

import cs3500.pa03.model.GameResult;
import cs3500.pa03.model.Player;

import java.io.IOException;

/**
 * Represents the view for a game of BattleSalvo.
 */
public class GameDisplay {
  private final Appendable appendable; // the output

  /**
   * Constructs a GameDisplay object.
   *
   * @param appendable the output
   */
  public GameDisplay(Appendable appendable) {
    this.appendable = appendable;
  }

  /**
   * Displays the start of the game.
   *
   * @throws IOException if the append fails
   */
  public void displayGameStart() throws IOException {
    appendable.append("Hello! Welcome to the OOD BattleSalvo Game!\n");
  }

  /**
   * displays message to get board size
   *
   * @throws IOException if the append fails
   */
  public void getBoardSize() throws IOException {

    appendable.append("Please enter a height and width between 6 and 15 below:\n" +
        "____________________________________________________________\n");
  }

  /**
   * displays message to get fleet size
   *
   * @param smallerDimension the smaller dimension of the board
   *                         (height or width)
   * @throws IOException if the append fails
   */
  public void getFleetSize(int smallerDimension) throws IOException {
    appendable.append("Please enter your fleet in the order " +
            "[Carrier, Battleship, Destroyer, Submarine]. \n" +
            "Remember, your fleet may not exceed size ")
        .append(String.valueOf(smallerDimension)).append(".\n" +
            "____________________________________________________________\n");

  }

  /**
   * displays message if fleet size is invalid
   *
   * @throws IOException if the append fails
   */
  public void invalidFleetSize() throws IOException{
      appendable.append("Uh Oh! You've entered invalid fleet sizes.\n");

  }

  /**
   * creates the board for the player
   *
   * @param player the player
   * @param board  the board
   * @throws IOException if the append fails
   */
  public void makeBoard(Player player, String[][] board) throws IOException {
    appendable.append(player.name()).append("'s board:\n");
    for (String[] strings : board) {
      for (String string : strings) {
        appendable.append(string);
      }
      appendable.append("\n");
    }

  }

  /**
   * displays message to get shot
   *
   * @param result the result of the shot
   */
  public void displayGameResult(GameResult result) throws IOException{

      switch (result) {
        case WIN -> appendable.append("You win!");
        case LOSE -> appendable.append("You lose!");
        case TIE -> appendable.append("You tied!");
      }
  }

  /**
   * displays message if board size is invalid
   *
   * @throws IOException if the append fails
   */
  public void invalidBoardSize() throws IOException{
      appendable.append("Uh Oh! You've entered invalid board size.\n");
  }

  /**
   * displays message to ask for shots
   *
   * @param activeShips the number of active ships
   *                    the player has left
   */
  public void askForShot(int activeShips) throws IOException{
      appendable.append("Please enter a shot in the form \"X Y\". You have ")
          .append(String.valueOf(activeShips)).append(" shots.\n");
  }

  /**
   * displays message if shot is invalid
   *
   * @throws IOException if the append fails
   */
  public void invalidShot() throws IOException{
      appendable.append("Uh Oh! You've entered an invalid shot.\n");
  }

  /**
   * Returns the appendable
   *
   * @return appendable
   */
  public Appendable getAppendable() {
    return appendable;
  }
}
