import strategy.*;

public class MiniDuckSimulator2 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new DuckType();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPower());
        model.performFly();
    }
}