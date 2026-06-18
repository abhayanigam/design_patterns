package creational_patterns.factory_design_pattern;

// 4. CONCRETE CREATORS / FACTORIES
// ==========================================
// These subclasses override the factory method to return their specific vehicles.
public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
