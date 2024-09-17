package ch3;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
