package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//传统的方式
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else {
                System.out.println("披萨种类不存在，退出");
                break;
            }

            //输出制作订单过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.boxing();
        } while (true);
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
