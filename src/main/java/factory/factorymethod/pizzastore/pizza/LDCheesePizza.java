package factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    public LDCheesePizza() {
    }

    @Override
    public void prepare() {
        this.setName(" 伦敦的奶酪披萨 ");
        System.out.println(" 准备伦敦奶酪披萨的材料中... ");
    }
}
