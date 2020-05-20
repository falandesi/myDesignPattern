package factory.factorymethod.pizzastore.order;


import factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//传统的方式
public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        while (true) {
            String orderType = this.getType();
            pizza = this.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.boxing();
            } else {
                System.out.println(" 披萨种类错误 ");
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
