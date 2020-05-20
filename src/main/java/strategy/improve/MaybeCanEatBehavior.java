package strategy.improve;

public class MaybeCanEatBehavior implements EatBehavior {
    @Override
    public void canEat() {
        System.out.println(" 鸭子可能可以吃 ");
    }
}
