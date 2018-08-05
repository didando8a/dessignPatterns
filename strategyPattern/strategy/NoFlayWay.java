package strategy;

class NoFlyWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
