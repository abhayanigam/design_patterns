package behavioral_patterns.observer_design_pattern;

// 4. CONCRETE OBSERVERS (The Subscribed Devices)
// ==========================================
public class BillboardDisplay implements ObserverInterface {
    @Override
    public void update(float temperature) {
        System.out.println("🏢 City Electronic Billboard: Displaying " + temperature + "°C to drivers.");
    }
}