package coffee;

import dagger.Component;

import javax.inject.Singleton;

public class CoffeeApp {
    @Singleton
    @Component(modules = {DripCoffeeModule.class})
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = coffee.DaggerCoffeeApp_CoffeeShop.builder().build();
        coffeeShop.maker().brew();
    }
}
