package commandPattern;

import java.util.HashMap;
import java.util.Map;

public class CentralHub {
    // The hub only ever talks to the Command interface.
    // It never knows what kind of device is behind a command,
    // so new devices can be added without changing this class.
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String label, Command command) {
        commands.put(label, command);
    }

    public String pressButton(String label) {
        Command command = commands.get(label);
        if (command == null) {
            return "No command assigned to \"" + label + "\"";
        }
        return command.execute();
    }
}