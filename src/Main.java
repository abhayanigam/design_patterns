import behavioral_patterns.command_design_pattern.Command;
import behavioral_patterns.observer_design_pattern.Observer;
import behavioral_patterns.state_design_pattern.State;
import behavioral_patterns.strategy_design_pattern.Strategy;
import creational_patterns.builder_design_pattern.Builder;
import structural_patterns.adapter_design_pattern.Adapter;
import structural_patterns.decorator_design_pattern.Decorator;
import creational_patterns.factory_design_pattern.Factory;
import creational_patterns.singleton_design_pattern.DemoSingletonThread;
import structural_patterns.facad_design_pattern.Facade;

public class Main {
    public static void main(String[] args) {
        // * Creational patterns (How Object is Created)

        // Ensures only one instance of a class is ever created and provides a global access point.
        System.out.println("--- Singleton Method Pattern --- \n");
        DemoSingletonThread.singletonExample();

        // Creates objects without exposing the exact creation logic to the client.
        System.out.println("--- Factory Method Pattern --- \n");
        Factory.factoryExample();

        // Constructs complex objects step-by-step, separating construction from representation.
        System.out.println("--- Builder Method Pattern --- \n");
        Builder.builderExample();

        // * Structural patterns (How Object is Connected)

        // Dynamically wraps an object to add new behaviors without changing its core class.
        System.out.println("--- Decorator Method Pattern --- \n");
        Decorator.decoratorExample();

        // Acts as a bridge to make two incompatible interfaces work together seamlessly.
        System.out.println("--- Adapter Method Pattern --- \n");
        Adapter.adapterExample();

        // Provides a single, simplified interface to hide a complex system of classes.
        System.out.println("--- Facade Method Pattern --- \n");
        Facade.facadeExample();

        // * Behavioral patterns (How Object is Communicated)

        // Encapsulates different algorithms so you can swap them easily at runtime.
        System.out.println("--- Strategy Method Pattern --- \n");
        Strategy.strategyExample();

        // Allows an object to alter its behavior completely when its internal state changes.
        System.out.println("--- State Method Pattern --- \n");
        State.stateExample();

        // Defines a publish-subscribe mechanism to notify multiple objects of state changes automatically.
        System.out.println("--- Observer Method Pattern --- \n");
        Observer.observerExample();

        // Turns a request or action into a standalone object that can be passed, queued, or undone.
        System.out.println("--- Command Method Pattern --- \n");
        Command.commandExample();

    }
}

/* 

    Your Mock Interview Challenge
    Now it is your turn to be the expert. 

    Question 4: "You are building a checkout system for a customized coffee shop. 
    You start with a base SimpleCoffee class. Customers can dynamically add 
    Milk, Caramel, Vanilla, or extra Espresso shots to their order. Each addition changes
    both the final price and the receipt description. How do you design this so you completely 
    avoid creating an explosion of subclasses like CoffeeWithMilkAndCaramel?"

    The Answer: Decorator Pattern
        You would start with a SimpleCoffee object that implements a Beverage interface 
        (cost: $2.00, description: "House Blend").
        Then, you create "Decorators" that also implement the Beverage interface, but they 
        take an existing Beverage in their constructor to wrap it.

        Wrap it in Milk (adds $0.50, appends " + Milk").

        Wrap that in Caramel (adds $0.75, appends " + Caramel").

    When you call .getCost() on the outermost wrapper, it delegates down the 
    chain: Caramel ($0.75) + Milk ($0.50) + Coffee ($2.00) = $3.25.

    Why Not Builder? (The "Gotcha")
        If an interviewer asks you "Why wouldn't you use Builder for this?", 
        here is your expert response:

        "The Builder pattern is Creational. Its job is to assemble a complex object 
        step-by-step and then return a final, static object when .build() is called. 
        It doesn't natively handle stacking recursive behavior like adding prices together. 
        The Decorator pattern is Structural; it allows us to dynamically wrap an object at 
        runtime to add new responsibilities (like a price bump) without modifying the 
        original object's code."

    Question: "You are building a real-time multiplayer chess game. You need a feature where 
    players can click 'Undo' to reverse their last 5 moves. Furthermore, if the server crashes,
    you need to be able to save the exact state of the board and restore it later. However, 
    the ChessBoard class has highly sensitive private variables (like hidden piece logic) that 
    you absolutely cannot expose to the rest of the application. How do you implement this 
    save/restore functionality safely?"

    The Approach (Re-evaluated):

        Trigger 1: "Click 'Undo' to reverse last 5 moves." You got this perfectly. 
            Treat moves as objects $\rightarrow$ Command Pattern.

        Trigger 2: "Save the exact state... restore it later." 
            This means we need to take a snapshot of the board.

        Trigger 3: "Cannot expose sensitive private variables." This is the ultimate "Gotcha." 
        If you just use getter/setter methods to save the board state to a database, you break 
        encapsulation (one of the core pillars of Object-Oriented Programming).
    
    The Answer: Command + Memento Pattern :
    
    To perfectly solve this, you need a compound architecture using both the Command Pattern and the Memento Pattern.

        1. Command Pattern (The Actions): Every time a player moves, you create a MoveCommand 
        object and push it onto a stack. If they click Undo, you pop the command and call .undo().

        2. Memento Pattern (The State): To handle the server crash and the strict encapsulation rules, you use Memento.
        The ChessBoard (the Originator) creates a BoardMemento object. This Memento acts as a locked black box. 
        It holds the internal private state of the board, but only the ChessBoard itself is allowed to open it and read the data.
        
        3. The Caretaker: The main game loop (the Caretaker) takes this locked Memento box and saves it to the database. 
        If the server crashes, the Caretaker fetches the Memento from the database and hands it back to the ChessBoard to 
        restore itself, completely preserving encapsulation.

*/