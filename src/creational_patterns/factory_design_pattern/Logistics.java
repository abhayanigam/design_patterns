package creational_patterns.factory_design_pattern;

// 3. THE CREATOR / FACTORY (Abstract Class)
// ==========================================
// The core concept: The base logistics class doesn't know which
// vehicle it will use. It forces subclasses to decide.
public abstract class Logistics {
    // This is the actual "Factory Method"
    public abstract Transport createTransport();

    // Regular business logic that operates on the product
    public void planDelivery(){
        // Call the factory method to get a vehicle
        Transport vehicle = createTransport();
        // Use the vehicle!
        vehicle.delivery();
    }
}
