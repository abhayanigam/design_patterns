package behavioral_patterns.command_design_pattern;

// 3. Concrete Commands
public class LightOnCommand implements CommandInterface {
    private final Light light; // Reference to the receiver

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

