package creational_patterns.builder_design_pattern;

public class Builder {
    public static void builderExample(){
        // Building a high - end gaming PC with all options
        Computer gamingPC = new Computer.ComputerBuilder("2Tb SSD", "32 Gb" )
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Gaming PC: " + gamingPC);

        // Building a budget office PC with NO options (Leaving them default false)
        Computer officePc = new Computer.ComputerBuilder("500GB HDD", "8 GB")
                .build();

        System.out.println("Office PC : " + officePc + "\n");
    }
}

/*
    Builder Design Pattern :
        The Builder Design Pattern is creational design pattern that allows you
        to construct complex objects step by step. Instead of relying on a massive constructor with dozens of
        parameters, it isolates the object construction logic inside a dedicated builder object.
*/
