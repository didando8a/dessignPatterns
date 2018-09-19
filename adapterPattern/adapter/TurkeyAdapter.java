package adapter;

public class TurkeyAdapter implements DuckInterface {
    TurkeyInterface turkey;

    public TurkeyAdapter(TurkeyInterface turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
