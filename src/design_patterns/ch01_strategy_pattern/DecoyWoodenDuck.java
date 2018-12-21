package design_patterns.ch01_strategy_pattern;

public class DecoyWoodenDuck extends Duck {

    public DecoyWoodenDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a decoy wooden duck");
    }

}