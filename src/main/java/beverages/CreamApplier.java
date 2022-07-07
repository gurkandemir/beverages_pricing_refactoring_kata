package beverages;

public class CreamApplier implements Beverage {

    private Beverage beverage;

    public CreamApplier(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.15;
    }
}
