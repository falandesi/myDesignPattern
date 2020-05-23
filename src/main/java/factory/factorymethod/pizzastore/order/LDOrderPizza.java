package factory.factorymethod.pizzastore.order;


import factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
