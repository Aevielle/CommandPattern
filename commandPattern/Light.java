package commandPattern;

public class Light {
    private int brightness = 0;

    public String turnOn() {
        brightness = 100;
        return "Light is ON (brightness: " + brightness + "%)";
    }

    public String turnOff() {
        brightness = 0;
        return "Light is OFF";
    }
}