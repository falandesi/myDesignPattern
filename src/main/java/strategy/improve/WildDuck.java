package strategy.improve;


public class WildDuck extends Duck {
    public WildDuck() {
        this.eatBehavior = new MaybeCanEatBehavior();
    }
    @Override
    public void display() {
        System.out.println(" 野生鸭 ");
    }

}
