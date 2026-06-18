package behavioral_patterns.state_design_pattern;

public class BluetoothState implements SoundSystemState {
    @Override
    public void pressPlay() {
        System.out.println("🎵 Streaming 'Bohemian Rhapsody' from your connected phone.\n");
    }
}