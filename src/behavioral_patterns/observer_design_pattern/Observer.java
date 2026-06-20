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


        Question 2: "You are building a weather app. When the weather station updates the 
        temperature, the mobile UI, the website UI, and the logging system all need
        to update immediately. How do you wire this up?"

        The Approach: You hear "one thing changes" and "many things need to react." 
        This is a classic one-to-many dependency.

        The Answer: Observer Pattern. The weather station is the Subject (or Publisher), 
        and the UIs/loggers are the Observers (or Subscribers). They register with the subject, 
        and the subject pushes updates to them.

        Question 2: "You are building the backend for a cryptocurrency trading platform. 
        Whenever the price of Bitcoin changes, the Web Dashboard, the Mobile App, 
        and an automated Trading Bot all need to be updated instantly. 
        How do you design this so the price tracker doesn't need to know the 
        specific details of the apps it's updating?"

        The Approach: You hear "one thing changes" (price) and "many things need to react 
        instantly" (Dashboard, App, Bot). This is a classic one-to-many relationship where 
        you need high decoupling.

        The Answer: Observer Pattern. The Bitcoin price tracker is the Subject, and the 
        Dashboard, App, and Bot are the Observers. The Observers register themselves with 
        the Subject. Whenever the price changes, the Subject simply loops through its list 
        of subscribers and calls a generic update() method on each of them.
 */