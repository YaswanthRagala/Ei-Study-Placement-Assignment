// Singleton class for Configuration Management
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configValue;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        // Load configuration settings
        this.configValue = "Default Config";
    }

    // Static method to provide access to the single instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Getter for configuration value
    public String getConfigValue() {
        return configValue;
    }

    // Method to update configuration value
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
