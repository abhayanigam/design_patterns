package creational_patterns.builder_design_pattern;

class Computer {
    // Required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // Getter methods (No Setters! This makes the object immutable/thread-safe)
    public String getHDD() { return HDD; }
    public String getRAM() { return RAM; }
    public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }

    // 1. The constructor is PRIVATE so only the Builder can call it
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer Specs [RAM=" + RAM + ", HDD=" + HDD +
                ", GraphicsCard=" + isGraphicsCardEnabled +
                ", Bluetooth=" + isBluetoothEnabled + "]";
    }

    // ==========================================
    // 2. THE STATIC INNER BUILDER CLASS
    // ==========================================
    public static class ComputerBuilder {
        // Same fields as the parent class
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        // Constructor for REQUIRED parameters
        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        // Methods for OPTIONAL parameters that return "this" (allows chaining)
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // The final method that delivers the complete object
        public Computer build() {
            return new Computer(this);
        }
    }
}