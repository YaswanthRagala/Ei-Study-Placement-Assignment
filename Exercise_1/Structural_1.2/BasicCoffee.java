// Concrete Component: Basic Coffee
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 2.0; // Base price for basic coffee
    }
}
