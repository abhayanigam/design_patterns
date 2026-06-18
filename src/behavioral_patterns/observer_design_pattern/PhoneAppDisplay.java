package behavioral_patterns.observer_design_pattern;

// 4. CONCRETE OBSERVERS (The Subscribed Devices)
// ==========================================
class PhoneAppDisplay implements ObserverInterface {
    @Override
    public void update(float temperature) {
        System.out.println("📱 Phone App Notification: Current Temp is " + temperature + "°C\n");
    }
}