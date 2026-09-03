package commandPattern;

public class SmartHomeApp {
    public static void main(String[] args) {
        // Receivers
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Invoker
        CentralHub hub = new CentralHub();

        // Wire up commands to the hub
        hub.setCommand("Light On", new LightOnCommand(light));
        hub.setCommand("Light Off", new LightOffCommand(light));
        hub.setCommand("Increase Temperature", new ThermostatIncreaseCommand(thermostat));
        hub.setCommand("Decrease Temperature", new ThermostatDecreaseCommand(thermostat));
        hub.setCommand("Increase Volume", new MusicPlayerVolumeUpCommand(musicPlayer));
        hub.setCommand("Decrease Volume", new MusicPlayerVolumeDownCommand(musicPlayer));

        // Send commands through the hub - it has no idea how each device works internally
        System.out.println(hub.pressButton("Light On"));
        System.out.println(hub.pressButton("Increase Temperature"));
        System.out.println(hub.pressButton("Increase Volume"));
        System.out.println(hub.pressButton("Light Off"));
        System.out.println(hub.pressButton("Decrease Temperature"));
        System.out.println(hub.pressButton("Decrease Volume"));
    }
}