package ch3;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", SteamedMilk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .10;
    }
}
