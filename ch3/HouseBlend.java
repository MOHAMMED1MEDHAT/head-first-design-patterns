package ch3;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
