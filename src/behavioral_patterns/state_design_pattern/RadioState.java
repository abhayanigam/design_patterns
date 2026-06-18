package behavioral_patterns.state_design_pattern;

// 2. CONCRETE STATES
// ==========================================
public class RadioState implements SoundSystemState {
    @Override
    public void pressPlay() {
        System.out.println("📻 Tuning into 98.1 FM... Playing live hit music!");
    }
}