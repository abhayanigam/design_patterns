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