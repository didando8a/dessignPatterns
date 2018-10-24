package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Coffee extends CaffeineBeverage {
  public void brew() {
    System.out.println("Dripping coffee through filter");
  }

  public void addCondiments() {
    System.out.println("Adding sugar and Milk");
  }

  @Override
  public boolean customeWantsCondiments() {
      String answer = getUserInput();

      if (answer.toLowerCase().startsWith("y")) {
          return true;
      } else {
          return false;
      }
  }

  private String getUserInput() {
      String answer = null;

      System.out.println("Would you like milk or sugar in your coffe (y/n)? ");

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      try {
          answer = in.readLine();
      } catch (IOException ioe) {
          System.err.println("IO error trying to read your answer");
      }

      if (answer == null) {
          return "no";
      }

      return answer;
  }
}
