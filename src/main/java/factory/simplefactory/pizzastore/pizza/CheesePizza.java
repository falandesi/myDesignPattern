package factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {

    }

    @Override
    public void prepare() {
        System.out.println(" 准备奶酪披萨的材料中... ");
    }
}
