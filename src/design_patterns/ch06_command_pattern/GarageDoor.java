package design_patterns.ch06_command_pattern;

public class GarageDoor {

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Close");
    }

    public void stop() {
        System.out.println("Garage Door has Stop");
    }

    public void lightOn() {
        System.out.println("Garage Door has light On");
    }

    public void lightOff() {
        System.out.println("Garage Door has light Off");
    }

}