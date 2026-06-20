package behavioral_patterns.state_design_pattern;

public class State {
    public static void stateExample() {
        SoundSystem speaker = new SoundSystem();

        // Action 1: System starts in default (Radio) state
        System.out.println("Initial State:");
        speaker.pressPlayButton();

        System.out.println();

        // Action 2: Switch the system to Bluetooth mode
        System.out.println("Switching to Bluetooth Mode...");
        speaker.setState(new BluetoothState());
        speaker.pressPlayButton();
    }
}
/*
    State Design Pattern:
        State Design Pattern is a behavioral pattern that allows an object to completely change its
        behavior when its internal state changes.

    In simple words, it is exactly like your Smartphone's Power Button.
        1. If your phone is ON, pressing the power button locks the screen.
        2. If your phone is OFF, pressing the exact same power button boots up the phone.
        3. If your phone is LOW BATTERY, pressing the power button might just show a blinking red battery icon.

    The button didn't change, but the internal state of the phone changed. Instead of writing a massive,
    messy switch statement inside the power button code (if status == ON ... else if status == OFF ...),
    the phone delegates the job to whichever State object is currently active.

    Important:
        State vs. Strategy: The Interview Showdown
            Because the class structures look virtually identical on a UML diagram,
            interviewers love to see if you can tell them apart based on their intent:

        1. Strategy Pattern: The client manually chooses how a specific task is done
        (e.g., "I choose to pay with a Credit Card today"). The interchangeable algorithms
        usually have no awareness of each other.

        2. State Pattern: The object switches its own behaviors automatically behind the scenes as
        its condition changes (e.g., an order moving itself to "Shipped" once a payment clears).
        The states are highly aware of each other to manage transitions.

    Question 3: "We are building a document management system. A document can be 'Draft', 
    'Under Review', or 'Published'. If a user clicks 'Publish' on a Draft, it should throw an error. 
    If they click it on 'Under Review', it succeeds. How do you design this to avoid writing a 
    massive switch statement for every single button click across the app?"

    The Approach: You hear "behavior changes based on current status," "avoid massive switch statements," 
    and "distinct lifecycle phases."

    The Answer: State Pattern. You create a DocumentState interface with methods for each 
    action (e.g., publish(), edit()). You then create concrete classes for each state 
    (DraftState, ReviewState, PublishedState). The core Document object delegates the 
    action to its current State object. The State object handles the logic and automatically 
    transitions the Document to the next appropriate state.
 */