package lab14.command.computer;

import java.util.LinkedList;
import java.util.List;

public class Switch {
    private List<Command> historyComnamds;

    public Switch() {
        historyComnamds = new LinkedList<>();
    }

    public void store(Command command) {
        historyComnamds.add(command);
    }

    public void execute(Command command) {
        command.execute();
    }

    public void executeAddStore(Command command) {
        execute(command);
        store(command);
    }

    public void reexecuteAllCommands() {
        for (Command command : historyComnamds) {
            command.execute();
        }
    }

}
