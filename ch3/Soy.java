package ch3;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + "Soy";
    }

    public double cost() {
        return this.beverage.cost() + .10;
    }
}
