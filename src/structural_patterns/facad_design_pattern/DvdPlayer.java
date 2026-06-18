package structural_patterns.facad_design_pattern;

public class DvdPlayer {
    public void turnOn() { System.out.println("💿 DVD Player turning on."); }
    public void playMovie(String movie) { System.out.println("💿 Playing movie: '" + movie + "'"); }
    public void stop() { System.out.println("💿 Stopping the movie."); }
    public void turnOff() { System.out.println("💿 DVD Player turning off.\n"); }
}