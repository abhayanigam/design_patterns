package structural_patterns.facad_design_pattern;

// 2. CLIENT CODE / TESTING METHOD
// ==========================================

public class Facade {
    public static void facadeExample() {
        // Step 1: Instantiate the complicated subsystem parts
        Lights lights = new Lights();
        Projector projector = new Projector();
        Soundbar soundbar = new Soundbar();
        DvdPlayer dvdPlayer = new DvdPlayer();

        // Step 2: Put them inside the Facade wrapper
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(lights, projector, soundbar, dvdPlayer);

        // Step 3: The client interacts ONLY with the simple facade!
        homeTheater.watchMovie("Inception");

        // Let's pretend the movie ended
        homeTheater.endMovie();
    }
}

/*
    Facade : Facade is a wrapper class that takes a messy, complicated subsystem with dozens of
    moving parts and gives the client code a clean, one-button interface to get the job done.

    * In simple words, it is exactly like ordering food on a delivery app (like UberEats or DoorDash).

    Example :
        When you want dinner, you open the app, tap a button that says "Order Pizza", and pay.
        You don't have to call the restaurant to check if they have ingredients, talk to the chef
        to see if the oven is hot, or manage the GPS tracking and routing for the delivery driver.
        The app acts as a Facade—it hides all the chaotic, multistep backend operations behind a single, simple click.
 */