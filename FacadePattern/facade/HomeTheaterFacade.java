package facade;

public class HomeTheaterFacade implements HomeTheaterInterface {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(
        Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd,
        Projector projector, TheaterLights lights, Screen screen,
        PopcornPopper popper
    ) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screens = screens;
        this.popper = popper;
    }

    public void watchMovide(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreen();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theather down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
