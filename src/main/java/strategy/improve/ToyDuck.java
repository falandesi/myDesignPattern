package strategy.improve;

public class ToyDuck extends Duck {
    public ToyDuck() {
        this.eatBehavior = new CanNotEatBehavior();
    }
    @Override
    public void display() {
        System.out.println(" 玩具鸭 ");
    }
}
