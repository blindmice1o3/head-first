package design_patterns.ch01_strategy_pattern;

public class MuteQuack
        implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}