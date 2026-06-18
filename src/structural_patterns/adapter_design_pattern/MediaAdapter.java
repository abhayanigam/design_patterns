package structural_patterns.adapter_design_pattern;

// ==========================================
// 3. THE ADAPTER
// ==========================================
// It implements the standard interface but wraps the incompatible advanced service.
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter() {
        this.advancedPlayer = new AdvancedMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        // The adapter translates the standard "play" call into the specific "playVlcFormat" call
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedPlayer.playVlcFormat(fileName);
        }
    }
}
