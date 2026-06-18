package behavioral_patterns.observer_design_pattern;

// 5. CLIENT CODE / TESTING METHOD
// ==========================================
public class Observer {
    public static void observerExample() {
        // Create the core Publisher
        WeatherStation station = new WeatherStation();

        // Create the Subscribers
        PhoneAppDisplay phoneApp = new PhoneAppDisplay();
        BillboardDisplay billboard = new BillboardDisplay();

        // Register/Subscribe the devices to the station
        station.registerObserver(phoneApp);
        station.registerObserver(billboard);

        // Update 1: Both devices get notified automatically
        station.setTemperature(26.5f);

        // Update 2: Let's unsubscribe the billboard
        System.out.println("\nRemoving Billboard Subscription ---");
        station.removeObserver(billboard);

        // Only the phone app will receive this update
        station.setTemperature(28.0f);
    }
}

/*
    Observer Design Pattern :
        Observer is a behavioral design pattern that lets you define a subscription mechanism
        to notify multiple objects about any events that happen to the object they’re observing.

    In simple words, it is exactly like subscribing to a YouTube Channel.
        1. The YouTube Channel is the Subject (the publisher).
        2. You and millions of other viewers are the Observers (the subscribers).
        3. When the creator uploads a new video, you don't keep opening their page every
            5 minutes to check (polling). Instead, YouTube automatically sends a
            Notification to everyone who clicked the bell icon.
        4. If you get tired of the channel, you hit Unsubscribe, and you stop getting notifications.
 */