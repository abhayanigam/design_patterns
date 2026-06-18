package behavioral_patterns.command_design_pattern;

// 1. The Command Interface
public interface CommandInterface {
    void execute();
    void undo();
}