package factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {

    public GreekPizza() {}
    @Override
    public void prepare() {
        System.out.println(" 准备希腊披萨的材料中... ");
    }
}
