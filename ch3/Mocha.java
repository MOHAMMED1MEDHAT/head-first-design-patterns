package ch3;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.description + ", Mocha";
    }

    public double cost() {
        return this.beverage.cost() + 0.20;
    }
}
