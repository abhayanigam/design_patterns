package structural_patterns.decorator_design_pattern;

// 2. CONCRETE COMPONENT
// ==========================================
// The core object that we want to decorate later.
public class BaseNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("App Push Notification: " + message);
    }
}
