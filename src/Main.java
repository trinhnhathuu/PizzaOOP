import store.DNPizzaStore;
import store.HUEPIizzaStore;
import store.base.PizzaStore;

public class Main {
    public static void main(String[] args) {
            var PizzaStore = new HUEPIizzaStore();
            PizzaStore.oderpizza("chesse");
        var PizzaStore1 = new DNPizzaStore();
        PizzaStore1.oderpizza("banana");
    }
}