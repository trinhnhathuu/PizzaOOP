package store;

import Pizzas.HuePizza.HUEBananaPizza;
import Pizzas.HuePizza.HUEChessePizza;
import Pizzas.base.Pizza;
import store.base.PizzaStore;

public class HUEPIizzaStore extends PizzaStore {
    @Override
    protected Pizza CreatePizza(String type) {
        switch (type){
                case "chesse":
                    return  new HUEChessePizza();

                case "banana":
                   return new HUEBananaPizza();
                default:
                    return null;
            }
    }
}
