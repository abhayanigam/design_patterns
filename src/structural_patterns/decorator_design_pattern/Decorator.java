package structural_patterns.decorator_design_pattern;

public class Decorator {
    public static void decoratorExample() {
        // Step 1: Start with just the base notifier
        Notifier basicAlert = new BaseNotifier();

        // Step 2: Decorate it with SMS capabilities
        Notifier smsAlert = new SMSDecorator(basicAlert);

        // Step 3: Stack another layer! Decorate the SMS notifier with WhatsApp capabilities
        Notifier fullyLoadedAlert = new WhatsAppDecorator(smsAlert);

        // Send a single message through the fully decorated stack
        System.out.println("Triggering fully decorated alert system:");
        fullyLoadedAlert.send("Your bank account statement is ready.\n");
    }
}

/*
    Decorator Design Pattern :
        Attaches additional responsibilities to an object dynamically at runtime.
        When to use: Adding optional features (like logging, encryption, or caching) to a service
        without altering its core structure or modifying the underlying class.

        OR

        Decorator is a structural design pattern that lets you attach new behaviors to objects by
        placing these objects inside special wrapper objects that contain the behaviors.
*/