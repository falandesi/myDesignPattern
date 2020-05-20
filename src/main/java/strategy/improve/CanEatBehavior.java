package strategy.improve;

public class CanEatBehavior implements EatBehavior {
    @Override
    public void canEat() {
        System.out.println(" 鸭子可以吃 ");
    }
}
