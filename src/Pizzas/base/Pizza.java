package Pizzas.base;

import java.util.ArrayList;
import java.util.List;

public  abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();




    public void perpare(){
        System.out.println("Perparing"+name);
        System.out.println("Tossing dough...." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toping:");
        if (toppings != null) {
            toppings.forEach((topping) -> System.out.println(topping));
        }

    }
    public void bake(){
        System.out.println("baking"+name+"in 30p");
    }
    public void cut(){
        System.out.println("Cutting"+name);
    }
    public void box(){
        System.out.println("Box" + name);
    }
}
