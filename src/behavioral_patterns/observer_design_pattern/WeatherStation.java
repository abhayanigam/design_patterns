package behavioral_patterns.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

// 3. CONCRETE SUBJECT
// ==========================================
public class WeatherStation implements Subject {
    private List<ObserverInterface> observers = new ArrayList<>();
    private float temperature;

    public void setTemperature(float newTemperature) {
        System.out.println("\n🌡️ Weather Station: Temperature changed to " + newTemperature + "°C");
        this.temperature = newTemperature;
        notifyObservers(); // Automatically trigger notifications!
    }

    @Override
    public void registerObserver(ObserverInterface o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverInterface o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update(temperature);
        }
    }
}