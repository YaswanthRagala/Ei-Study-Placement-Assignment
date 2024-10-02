public class Main {
    public static void main(String[] args) {
        // Create Receivers (Light)
        Light livingRoomLight = new Light();

        // Create Commands for Light On and Off
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create an Invoker (Smart Home Controller)
        SmartHomeController controller = new SmartHomeController();

        // Turn the light ON
        controller.setCommand(lightOn);
        controller.pressButton();  // Output: Light is ON

        // Turn the light OFF
        controller.setCommand(lightOff);
        controller.pressButton();  // Output: Light is OFF
    }
}
