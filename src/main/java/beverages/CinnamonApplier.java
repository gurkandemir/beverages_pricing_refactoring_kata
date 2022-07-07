package beverages;

public class CinnamonApplier implements Beverage {

    private Beverage beverage;

    public CinnamonApplier(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.05;
    }
}
