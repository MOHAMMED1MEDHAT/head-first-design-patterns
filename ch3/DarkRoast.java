package ch3;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }

}
