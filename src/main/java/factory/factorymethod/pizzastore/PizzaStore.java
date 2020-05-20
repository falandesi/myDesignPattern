package factory.factorymethod.pizzastore;

import factory.factorymethod.pizzastore.order.BJOrderPizza;
import factory.factorymethod.pizzastore.order.LDOrderPizza;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        System.out.println(" 输入地点 bj or ld：");
        Scanner input = new Scanner(System.in);
        String loc = input.next();
        if (loc.equals("bj")) {
            new BJOrderPizza();
        } else {
            new LDOrderPizza();
        }

    }
}
