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

    Question 1: "We are developing a feature to let users create custom profiles. 
    A profile requires a username and email, but optionally includes age, address,
    phone number, bio, profile picture URL, and social links. How do you design the 
    object creation so we don't end up with a constructor that takes 10 arguments, mostly nulls?"

        The Approach: You hear "complex object," "many optional parameters," and the desire to avoid 
        a "massive constructor" (often called the telescoping constructor anti-pattern).

        The Answer: Builder Pattern. You create a separate ProfileBuilder class. 
        It takes the required fields (username, email) in its own constructor, and has 
        individual, chainable methods for the optional fields (e.g., setAge(25), setBio("Hello")). 
        Finally, you call a .build() method which returns the fully constructed, immutable Profile object.
*/
