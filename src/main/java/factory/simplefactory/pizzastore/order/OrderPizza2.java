package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//采用简单工厂模式
public class OrderPizza2 {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza2(SimpleFactory simpleFactory) {
        this.setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;

        while (true) {
            orderType = this.getType();
            this.pizza = this.simpleFactory.createPizza(orderType);
            if (this.pizza == null) {
                System.out.println(" 订购披萨失败 ");
                return;
            }

            this.pizza.prepare();
            this.pizza.bake();
            this.pizza.cut();
            this.pizza.boxing();
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
