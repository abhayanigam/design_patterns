package structural_patterns.facad_design_pattern;

// ==========================================
// 1. THE FACADE
// ==========================================
// This class wraps the messy components and presents a clean interface.
public class HomeTheaterFacade {
    private Lights lights;
    private Projector projector;
    private Soundbar soundbar;
    private DvdPlayer dvdPlayer;

    // The facade accepts all subsystem parts in its constructor
    public HomeTheaterFacade(Lights lights, Projector projector, Soundbar soundbar, DvdPlayer dvdPlayer) {
        this.lights = lights;
        this.projector = projector;
        this.soundbar = soundbar;
        this.dvdPlayer = dvdPlayer;
    }

    // A simple, unified method for the client
    public void watchMovie(String movie) {
        System.out.println("🍿 Get ready to watch a movie... Preparing theater... \n");
        lights.dim();
        projector.turnOn();
        projector.setInputDVD();
        soundbar.turnOn();
        soundbar.setVolume(20);
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
        System.out.println("\n🎬 Theater is ready! Enjoy your show!");
    }

    // Another simple, unified method to shut everything down cleanly
    public void endMovie() {
        System.out.println("\nShutting down home theater... \n");
        lights.turnOn();
        projector.turnOff();
        soundbar.turnOff();
        dvdPlayer.stop();
        dvdPlayer.turnOff();
    }
}
