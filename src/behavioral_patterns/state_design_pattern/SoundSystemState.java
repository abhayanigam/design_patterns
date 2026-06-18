package behavioral_patterns.state_design_pattern;

// 1. THE STATE INTERFACE
// ==========================================
// Every concrete state must implement these actions.
public interface SoundSystemState {
    void pressPlay();
}