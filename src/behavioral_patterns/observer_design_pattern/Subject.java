package behavioral_patterns.observer_design_pattern;

// 2. THE SUBJECT INTERFACE (The Publisher)
// ==========================================
public interface Subject {
    void registerObserver(ObserverInterface o);
    void removeObserver(ObserverInterface o);
    void notifyObservers();
}