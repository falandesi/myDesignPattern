package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.Pizza;

public interface AbstractFactory {
    Pizza createPizza(String orderType);
}
