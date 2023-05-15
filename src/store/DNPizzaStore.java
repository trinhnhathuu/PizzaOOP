package store;
import Pizzas.DNPizza.DNBananaPizza;
import Pizzas.DNPizza.DNChessePizza;
import Pizzas.base.Pizza;
import store.base.PizzaStore;

public class DNPizzaStore extends PizzaStore {


    @Override
    protected Pizza CreatePizza(String type) {
        switch (type){
            case "chesse":
                return  new DNChessePizza();

            case "banana":
                return new DNBananaPizza();
            default:
                return null;
        }
    }
}
