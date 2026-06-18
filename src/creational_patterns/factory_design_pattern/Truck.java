package creational_patterns.factory_design_pattern;

// 2. CONCRETE PRODUCTS
// ==========================================
// These are the actual vehicle types that do the work.
public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery by land in a cargo box truck");
    }
}
