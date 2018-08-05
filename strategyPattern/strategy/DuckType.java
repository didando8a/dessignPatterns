package strategy;

public class DuckType extends Duck {
    public DuckType() {
        flyBehavior = new NoFlyWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
