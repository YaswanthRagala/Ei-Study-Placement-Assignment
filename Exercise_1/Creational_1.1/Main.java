public class Main {
    public static void main(String[] args) {
        // Accessing the Singleton instance
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        System.out.println(configManager1.getConfigValue()); // Output: Default Config

        // Changing the configuration value
        configManager1.setConfigValue("New Config");

        // Accessing the same instance from another reference
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println(configManager2.getConfigValue()); // Output: New Config
    }
}
