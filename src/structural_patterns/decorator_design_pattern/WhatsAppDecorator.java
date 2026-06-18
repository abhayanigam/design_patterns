package structural_patterns.decorator_design_pattern;

class WhatsAppDecorator extends NotifierDecorator {
    public WhatsAppDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);   // Do the previous behaviors
        sendWhatsApp(message); // Add yet another feature!
    }

    private void sendWhatsApp(String message) {
        System.out.println("Extra Feature - WhatsApp Message Sent: " + message);
    }
}