package behavioral_patterns.command_design_pattern;

// 4. The Invoker
public class RemoteControl {
    private CommandInterface slot;

    public void setCommand(CommandInterface command) {
        this.slot = command;
    }

    public void pressButton() {
        slot.execute();
    }
}
