package cs3500.pa03;

import cs3500.pa03.controller.PlayGame;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is the main driver of this project.
 */
public class Driver {
  /**
   * Project entry point
   *
   * @param args - no command line args required
   */
  public static void main(String[] args) {
    PlayGame play = new PlayGame(new InputStreamReader(System.in), System.out);
    try {
      play.run();
    } catch (IOException e) {
      System.out.println("Error running game");
    }
  }
}