package abstract_factory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    Abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PiazzaStore box");
    }

    String setName(String name) {
        this.name = name
    }

    @Override
    public String toString() {
        System.out.println("preparing pizza" + this.name);
    }

}
