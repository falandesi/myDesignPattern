package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import factory.abstractfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println(" 伦敦披萨工厂 ");
        if("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
