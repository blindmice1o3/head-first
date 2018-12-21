package design_patterns.ch06_command_pattern;

public class Light {

    String name;

    public Light() {

    }
    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println("Light is Off");
    }

}