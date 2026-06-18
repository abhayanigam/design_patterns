package structural_patterns.decorator_design_pattern;

// 3. THE BASE DECORATOR (Abstract Class)
// ==========================================
// It implements the same interface AND wraps a Notifier object inside.
abstract class NotifierDecorator implements Notifier{
    protected Notifier wrappedNotifier; // The Object being wrapped

    public NotifierDecorator(Notifier notifier){
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message); // Forward the core call
    }
}
