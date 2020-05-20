package factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza {
    public PepperPizza() {
    }

    @Override
    public void prepare() {
        System.out.println(" 准备胡椒披萨的材料中... ");
    }
}
