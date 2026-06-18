package creational_patterns.factory_design_pattern;

// ==========================================
// 5. CLIENT CODE / TESTING METHOD
// ==========================================
public class Factory {
    public static void runCompanyOperations(Logistics company){
        company.planDelivery();
    }

    public static void factoryExample(){


        // Scenario A: Setting up operations for domestic land delivery
        System.out.println("Starting land operations:");
        Logistics roadCompany = new RoadLogistics();
        runCompanyOperations(roadCompany);

        System.out.println();

        // Scenario B: Setting up operations for international ocean delivery
        System.out.println("Starting ocean operations:");
        Logistics seaCompany = new SeaLogistics();
        runCompanyOperations(seaCompany);
    }
}


/* *
    Factory Design Pattern:
        The factory design pattern is a creational design pattern that abstract and delegates the process of object
        creation. Instead of using new keywords directly in you application's core logic, you ask a dedicated "Factory"
        class to create the required object for you based on specific condition or inputs.


    📦 The Logistics/Delivery Example
        Imagine you run a delivery startup. On day one, your business is small,
        so you only deliver packages using Trucks. All your code handles a Truck object.

        A year later, your business explodes, and now you need to deliver packages across the ocean using Ships.

            > The Problem: If you didn't use a Factory, your entire codebase is tightly locked into new Truck().
             To add ships, you have to rip apart your existing code, risking breaking everything.

            > The Factory Solution: You create a general Logistics company class with a blank
             factory method called createTransport().

                1. Your RoadLogistics subclass implements this method to return a Truck.
                2. Your SeaLogistics subclass implements this method to return a Ship.

        The main application code just says, "Hey Logistics, give me a transport vehicle and deliver this package."
         It doesn't care whether it gets a Truck or a Ship; it just cares that the vehicle knows how to deliver().
*/