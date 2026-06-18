package behavioral_patterns.command_design_pattern;

//2. The Receiver
public class Light {
    public void turnOn() {
        System.out.println("The light is ON.\n");
    }
    public void turnOff() {
        System.out.println("The light is OFF.\n");
    }
}