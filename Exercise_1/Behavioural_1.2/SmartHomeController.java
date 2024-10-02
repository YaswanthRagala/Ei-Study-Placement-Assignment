// Invoker: Smart Home Controller
public class SmartHomeController {
    private Command command;

    // Method to set a command dynamically
    public void setCommand(Command command) {
        this.command = command;
    }

    // Method to execute the current command
    public void pressButton() {
        command.execute();
    }
}
