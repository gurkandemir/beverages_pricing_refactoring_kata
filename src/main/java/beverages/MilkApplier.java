package beverages;

public class MilkApplier implements Beverage {

    private Beverage beverage;

    public MilkApplier(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.10;
    }
}
