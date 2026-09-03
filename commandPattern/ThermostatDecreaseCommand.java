package commandPattern;

public class ThermostatDecreaseCommand implements Command {
    private Thermostat thermostat;

    public ThermostatDecreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.decreaseTemperature();
    }
}