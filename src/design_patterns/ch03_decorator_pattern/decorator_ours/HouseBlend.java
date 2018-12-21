package design_patterns.ch03_decorator_pattern.decorator_ours;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        System.out.println("HouseBlend's cost");
        return 0.89;
    }

}