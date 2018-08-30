package command;

public class Light {
    private boolean on;

    public Light() {
        this.on = false;
    }

    public void on() {
        on = true;
        System.out.println("Light is ON");
    }

    public void off() {
        on = false;
        System.out.println("Light is OFF");
    }
}
