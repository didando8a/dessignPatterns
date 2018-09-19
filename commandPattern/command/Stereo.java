package command;

public class Stereo  {
    private boolean lightOn;
    private boolean doorUp;

    public Stereo() {
        this.lightOn = false;
        this.doorUp = false;
    }

    public void up() {
        if (!isOpen()) {
            doorUp = true;
            System.out.println("Garage door is open");
        }
    }

    public void down() {
        if (isOpen()) {
            doorUp = false;
            System.out.println("Garage door is closed");
        }
    }

    public void stop() {

    }

    public void lightOn() {

    }

    public void lightOff() {

    }

    private boolean isOpen() {
        return (doorUp == true);
    }
}
