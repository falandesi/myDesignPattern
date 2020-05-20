package strategy.improve;

public class CanNotEatBehavior implements EatBehavior {
    @Override
    public void canEat() {
        System.out.println(" 鸭子不能吃 ");
    }
}
