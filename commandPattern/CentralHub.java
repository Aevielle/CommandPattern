package commandPattern;

import java.util.HashMap;
import java.util.Map;

public class smartHub{
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
