package commandPattern;

public class ThermostatIncreaseCommand implements Command {
    private Thermostat thermostat;

    public ThermostatIncreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.increaseTemperature();
    }
}