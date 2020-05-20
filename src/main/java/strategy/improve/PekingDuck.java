package strategy.improve;

public class PekingDuck extends Duck {
    public PekingDuck() {
        this.eatBehavior = new CanEatBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 北京鸭 ");
    }
}
