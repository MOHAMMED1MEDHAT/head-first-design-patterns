package ch4.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough..." + this.dough);
        System.out.println("Adding sauce..." + this.sauce);
        System.out.println("Adding toppings: ");
        for (String topping : this.toppings) {
            System.out.print(" " + topping + " ");
        }
    }

    void bake() {
        System.out.println("bake for 15 min in 250 c");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    String getName() {
        return this.name;
    }
}
