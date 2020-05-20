package factory.simplefactory.pizzastore.order;


import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

//采用简单工厂模式 管理披萨 order 只需要使用工厂即可
public class SimpleFactory {
    public SimpleFactory() {
    }

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println(" 使用简单工厂模式 ");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if ("pepper".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName(" 胡椒披萨 ");
        }

        return pizza;
    }

    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println(" 使用简单工厂模式 ");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if ("pepper".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName(" 胡椒披萨 ");
        }

        return pizza;
    }
}
