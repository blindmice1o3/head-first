package design_patterns.ch01_strategy_pattern;

public class FlyNoWay
        implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly");
    }

}