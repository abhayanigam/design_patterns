package structural_patterns.adapter_design_pattern;

// ==========================================
// 4. THE CONCRETE CLIENT IMPLEMENTATION
// ==========================================
class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Built-in support for MP3 files
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 audio file: " + fileName + "\n");
        }
        // Use the adapter to gain support for VLC files!
        else if (audioType.equalsIgnoreCase("VLC")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Error: Format '" + audioType + "' not supported.\n");
        }
    }
}
