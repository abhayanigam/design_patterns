package structural_patterns.decorator_design_pattern;

// 4. CONCRETE DECORATORS
// ==========================================
public class SMSDecorator extends NotifierDecorator{
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Do the original behavior
        sendSMS(message);    // Add the extra feature!
    }

    private void sendSMS(String message) {
        System.out.println("Extra Feature - SMS Sent: " + message);
    }
}
