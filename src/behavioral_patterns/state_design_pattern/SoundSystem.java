package behavioral_patterns.state_design_pattern;

// 3. THE CONTEXT (The Main Device)
// ==========================================
public class SoundSystem {
    private SoundSystemState currentState;

    public SoundSystem() {
        // Set the initial default state
        this.currentState = new RadioState();
    }

    // Allow the system to swap states dynamically
    public void setState(SoundSystemState state) {
        this.currentState = state;
    }

    // The core action that behaves differently depending on the active state
    public void pressPlayButton() {
        currentState.pressPlay(); // Delegate the action to the state object!
    }
}