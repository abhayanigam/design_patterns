package creational_patterns.singleton_design_pattern;

public class Singleton {
    private static  Singleton instance;
    public String value;

    private Singleton(String value){
        // The Following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value=value;
    }

    public static Singleton getInstance(String value){
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}

/* *
    Singleton Design Pattern:
        Singleton is a creational design pattern, Which ensures that only one object of its kind exists and provides
        a single point of access to it for any other code.

    How It Works (In Plain English)
        Normally, when you want to use a class, you use the new keyword to create a brand-new object.

        With a Singleton, the class itself takes control of its own creation:
        1. Hidden Constructor: It makes its constructor private. This acts like a locked door—no outside code can
            use new MyClass() to make a copy.

        2. The Gatekeeper Method: It provides a special static method (usually called getInstance()).

        3. The Logic: When you call getInstance(), the class checks: "Have I already created an instance before?"
            1. If No, it creates one and saves it.
            2. If Yes, it just hands you the one it already created.


    📺 The Living Room Remote Example
        Imagine a household with five family members, but only one physical TV remote.

    > No Matter Who Picks It Up: Whether Mom, Dad, or the kids have the remote, they are all holding the exact same device.
    > Shared State: If Mom uses the remote to change the channel to 5, and then hands it to Dad,
        Dad doesn't get a "fresh" remote. He holds the same remote, and the TV is still on channel 5.
    > Why You Can't "New" It: You cannot simply snap your fingers and duplicate the remote out of thin air.
        There is only one physical unit tied to that television.

    In software, a Singleton works exactly like this remote. It is a single object shared by every part of your program.
*/