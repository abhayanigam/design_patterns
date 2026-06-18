package structural_patterns.adapter_design_pattern;

// ==========================================
// 2. THE ADAPTER (The incompatible advanced service)
// ==========================================
public class AdvancedMediaPlayer {
    public void playVlcFormat(String fileName) {
        System.out.println("Playing VLC video file: " + fileName);
    }
}