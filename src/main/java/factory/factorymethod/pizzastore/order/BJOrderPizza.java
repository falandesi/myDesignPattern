package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
