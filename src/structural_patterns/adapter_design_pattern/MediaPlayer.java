package structural_patterns.adapter_design_pattern;

// ==========================================
// 1. THE TARGET INTERFACE (What the client expects)
// ==========================================
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
