import singleton.*;

public class RunChocolateFactory {
  public static void main(String[] args) {
    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getChocolateBoiler();
  }
}
