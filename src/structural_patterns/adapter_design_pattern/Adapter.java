package structural_patterns.adapter_design_pattern;

// ==========================================
// 5. CLIENT CODE / TESTING METHOD
// ==========================================
public class Adapter {
    public static void adapterExample() {
        AudioPlayer player = new AudioPlayer();

        // 1. Works out of the box (Native support)
        player.play("MP3", "bohemian_rhapsody.mp3");

        // 2. Works seamlessly because of the Adapter!
        player.play("VLC", "movie_trailer.vlc");

        // 3. Unadapted, unsupported format
        player.play("AVI", "home_video.avi");
    }
}

/*
    Adapter: Allows incompatible interfaces to work together.
    OR
    Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

    When to use: Integrating third-party libraries or legacy code into a modern codebase without rewriting them.
*/