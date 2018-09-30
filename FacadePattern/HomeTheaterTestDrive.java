import facade.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        //Instaciated components Here
        Amplifier amp = new Amplifier();
        Tuner tuner = new tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
            amp, tunner, dvd, cd, projector, lights, screen, popper
        );

        homeTheaterFacade.watchMovide("Sheck");
        homeTheaterFacade.endMovie();
    }
}
