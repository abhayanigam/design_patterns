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
 */