package strategy;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println(" 玩具鸭 ");
    }

    @Override
    public void canEat() {
        System.out.println(" 玩具鸭不能吃 ");
    }
}
