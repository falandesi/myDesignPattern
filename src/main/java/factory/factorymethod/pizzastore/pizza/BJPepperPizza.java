package factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    public BJPepperPizza() {
    }

    @Override
    public void prepare() {
        this.setName(" 北京的胡椒披萨 ");
        System.out.println(" 准备北京胡椒披萨的材料中...");
    }
}
