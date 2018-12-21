package design_patterns.ch01_strategy_pattern;

public class Squeak
        implements QuackBehavior {

    public void quack() {
        System.out.println("Squeak");
    }

}