package design_patterns.ch03_decorator_pattern.decorator_ours;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}