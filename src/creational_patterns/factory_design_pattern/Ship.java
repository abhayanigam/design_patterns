package creational_patterns.factory_design_pattern;

// 2. CONCRETE PRODUCTS
// ==========================================
// These are the actual vehicle types that do the work.
public class Ship implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivering by sea via a container ship.\n");
    }
}
