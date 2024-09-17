package ch3;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        // System.out.println(houseBlend.getDescription());

        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Soy(decaf);
        decaf = new SteamedMilk(decaf);
        // System.out.println(decaf.getDescription());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        // System.out.println(darkRoast.getDescription());

    }
}
