package factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    public BJCheesePizza() {
    }

    @Override
    public void prepare() {
        this.setName(" 北京的奶酪披萨 ");
        System.out.println(" 准备北京奶酪披萨的材料中... ");
    }
}
