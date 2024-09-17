package ch3;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return this.getSize() == Size.TALL ? 1.99
                : this.getSize() == Size.GRANDE ? 3.29
                        : 3.99;
    }
}
