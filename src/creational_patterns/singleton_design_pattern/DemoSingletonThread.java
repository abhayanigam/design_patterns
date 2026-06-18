package creational_patterns.singleton_design_pattern;

public class DemoSingletonThread {
    public static void singletonExample(){
        System.out.println("Singleton Example");
        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("If you see different values, then 2 singletons were created (booo!!)");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("WOO");

        System.out.println("Called the First Singleton : " + singleton.value);
        System.out.println("Called the another Singleton : " + anotherSingleton.value + "\n");
    }
}
