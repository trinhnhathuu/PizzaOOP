package store.base;

import Pizzas.base.Pizza;

public  abstract class PizzaStore
{

       public void oderpizza(String type){
           Pizza pizza;
           pizza = CreatePizza(type);
           pizza.cut();
           pizza.perpare();
           pizza.bake();
           pizza.box();
           System.out.println("----------------");

        }
        protected abstract Pizza CreatePizza(String type);


}
