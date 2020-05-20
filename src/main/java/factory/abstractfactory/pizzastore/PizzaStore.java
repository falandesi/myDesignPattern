package factory.abstractfactory.pizzastore;


import factory.abstractfactory.pizzastore.order.BJFactory;
import factory.abstractfactory.pizzastore.order.LDFactory;
import factory.abstractfactory.pizzastore.order.OrderPizza;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        System.out.println(" 输入地点 bj or ld：");
        Scanner input = new Scanner(System.in);
        String loc = input.next();
        if (loc.equals("bj")) {
            new OrderPizza(new BJFactory());
        } else {
            new OrderPizza(new LDFactory());
        }
    }
}
