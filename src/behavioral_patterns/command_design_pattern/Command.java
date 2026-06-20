package behavioral_patterns.command_design_pattern;

//5. The Client Assembly
public class Command {
    public static void commandExample() {
        // Create Receiver
        Light livingRoomLight = new Light();

        // Create Command and pass the Receiver to it
        CommandInterface lightOn = new LightOnCommand(livingRoomLight);

        // Create Invoker and set the Command
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);

        // Trigger execution
        remote.pressButton(); // Outputs: The light is ON.
    }

}

/*
    Command Design Pattern :
        The Command Design Pattern is a behavioral design pattern that encapsulates a request as
        a standalone object containing all information about the request.

    Key Components:
    The pattern relies on five core components:
        1. Command Interface: Declares the execution contract, typically containing a single execute() method.
        2. Concrete Command: Implements the interface, binds a Receiver to an action,
            and invokes the matching operation on the receiver.
        3. Receiver: The object containing the actual business logic to perform the work.
        4. Invoker: The object that holds the command and triggers its
            execution without knowing how the operation works.
        5. Client: Creates the concrete commands and pairs them with their designated receivers

    Question 5: "Design a text editor. Users need to be able to format text, 
    but more importantly, they need unlimited Undo and Redo capabilities. How do you structure this?"

        The Approach: You hear "Undo/Redo." This means operations need to be 
        treated as standalone objects that can be stored in a history queue, 
        and you need a way to restore previous states.

        The Answer: A combination of the Command Pattern and the Memento Pattern.

        Command: Every action (Type, Delete, Bold) is a Command object with execute() and undo() methods. 
        You push these onto a stack.

        Memento: To handle complex undos without breaking encapsulation, you use Memento to 
        save snapshots of the text editor's state so a Command can restore it if needed.

    Example: The text editor has a Command interface with execute() and undo() methods.
        Each formatting action (BoldCommand, ItalicCommand, etc.) implements this interface.
        When a user performs an action, the editor creates the corresponding Command object,
        executes it, and pushes it onto the undo stack. If the user hits Undo, the editor pops 
        the last Command from the stack and calls its undo() method, restoring the previous state.


    Question 4: "You are designing a smart home automation app. 
    The user can press buttons on their phone to 'Turn on Lights', 'Lock Doors', 
    or 'Start Coffee Maker'. We also need the ability to schedule these actions for later, 
    or queue them up to run in sequence. How do you implement this action system?"

    The Approach: You hear "actions," "schedule for later," and "queue them up." 
    You need to treat method calls as standalone objects so you can pass them around.

    The Answer: Command Pattern. You encapsulate every request into a standalone object 
    that implements a Command interface containing an execute() method. 
    (e.g., LightOnCommand, LockDoorCommand). Because the actions are now objects, 
    you can easily store them in a List, schedule them in a queue, or log them.
 */