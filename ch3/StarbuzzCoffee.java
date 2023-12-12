package ch3;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        System.out.println(espresso.getDescription() + "$" + espresso.cost());

        Beverage housBlend = new HousBlend();
        housBlend = new Mocha(housBlend);
        housBlend = new Mocha(housBlend);
        housBlend = new Mocha(housBlend);

    }
}
