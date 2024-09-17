package ch3;

import ch3.Beverage.Size;

public class StarBuzzCoffee {
        public static void main(String[] args) {
                Beverage espresso = new Espresso();
                espresso.setSize(Size.GRANDE);
                System.out.println(espresso.getDescription()
                                + " $" + espresso.cost());

                Beverage houseBlend = new HouseBlend();
                houseBlend = new Mocha(houseBlend);
                houseBlend = new Mocha(houseBlend);
                houseBlend = new Mocha(houseBlend);
                houseBlend.setSize(Size.GRANDE);
                System.out.println(houseBlend.getDescription()
                                + " $" + houseBlend.cost());

                Beverage decaf = new Decaf();
                decaf = new Mocha(decaf);
                decaf = new Soy(decaf);
                decaf = new SteamedMilk(decaf);
                decaf.setSize(Size.GRANDE);
                System.out.println(decaf.getDescription()
                                + " $" + decaf.cost());

                Beverage darkRoast = new DarkRoast();
                darkRoast = new Mocha(darkRoast);
                darkRoast = new Soy(darkRoast);
                darkRoast.setSize(Size.GRANDE);
                System.out.println(darkRoast.getDescription()
                                + " $" + darkRoast.cost());

        }
}
