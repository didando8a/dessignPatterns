package template;

public abstract class CaffeineBeverage {
  public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customeWantsCondiments()) {
        addCondiments();
    }
  }

  public void boilWater() {
    System.out.println("Boiling water");
  }

  public abstract void brew();

  public void pourInCup() {
    System.out.println("Pouring into cup");
  }

  public abstract void addCondiments();

  public boolean customeWantsCondiments() {
      return true;
  }
}
