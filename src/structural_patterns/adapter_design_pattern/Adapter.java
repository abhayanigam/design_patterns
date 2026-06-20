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


    Question 1: "Our modern mobile application uses JSON to communicate. 
    However, we just acquired a company whose legacy billing system only accepts XML. 
    We need to send our user payment data to their billing system, but we don't have the time 
    or budget to rewrite their entire backend. How do you resolve this?"

    The Approach: You hear "incompatible interfaces," "JSON vs XML," and "legacy system integration." 
    The constraint is that you cannot modify the existing legacy code.

    The Answer: Adapter Pattern. You create a wrapper class (the Adapter) that implements
    the modern interface your mobile app expects. Inside this Adapter, you take the 
    incoming JSON, translate it into XML, and then pass it along to the legacy billing system. 
    It acts exactly like a travel plug adapter for a foreign power outlet.
*/