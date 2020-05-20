package factory.abstractfactory.pizzastore.order;

import factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(AbstractFactory abstractFactory) {
        this.setFactory(abstractFactory);
    }

    private void setFactory(AbstractFactory abstractFactory) {
        Pizza pizza = null;
        String orderType = "";

        while (true) {
            orderType = getType();
            pizza = abstractFactory.createPizza(orderType);

            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.boxing();
            } else {
                System.out.println(" 披萨种类有误 ");
                break;
            }
        }

    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException var3) {
            var3.printStackTrace();
            return "";
        }
    }
}
