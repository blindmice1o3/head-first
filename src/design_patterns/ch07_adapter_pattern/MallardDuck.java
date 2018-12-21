package design_patterns.ch07_adapter_pattern;

public class MallardDuck
        implements Duck {

    // Simple implementations: the duck just prints out what it is doing.
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

}