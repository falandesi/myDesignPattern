package factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    public LDPepperPizza() {
    }

    @Override
    public void prepare() {
        this.setName(" 伦敦的胡椒披萨 ");
        System.out.println(" 准备伦敦胡椒披萨的材料中... ");
    }
}
