package design_patterns.ch01_strategy_pattern;

public class Quack
        implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }

}