package lab14.command.computer;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Switch switcher = new Switch();
        Command command1 = new ShutDownCommand(computer1);
        Command command2 = new RestartCommand(computer1);
        switcher.store(command1);
        switcher.store(command2);
        switcher.execute(command1);
        switcher.execute(command2);
        System.out.println();
        switcher.reexecuteAllCommands();
    }
}
