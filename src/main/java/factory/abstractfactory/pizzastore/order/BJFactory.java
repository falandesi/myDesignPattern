package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import factory.abstractfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println(" 北京披萨工厂 ");
        if("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
