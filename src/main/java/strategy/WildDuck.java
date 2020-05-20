package strategy;

public class WildDuck extends Duck {
    @Override
    public void display() {
        System.out.println(" 野生鸭 ");
    }

    @Override
    public void canEat() {
        System.out.println(" 野生鸭可能可以吃 ");
    }
}
