package ch3;

public abstract class Beverage {
    public enum Size {
        TALL, GRANDE, VENTI
    };

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
