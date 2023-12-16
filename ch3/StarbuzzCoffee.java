package ch3;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        System.out.println(espresso.getDescription() + "$" + espresso.cost());

        Beverage housBlend = new HousBlend();
        housBlend = new Mocha(housBlend);
        housBlend = new Mocha(housBlend);
        housBlend = new Mocha(housBlend);

        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Soy(decaf);
        decaf = new SteamedMilk(decaf);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);

    }
}
