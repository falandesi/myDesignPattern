package strategy.improve;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.CanEat();
        System.out.println("=================================");
        Duck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.CanEat();
        System.out.println("===========禁止吃野味===========");
        wildDuck.setEatBehavior(new CanNotEatBehavior());
        wildDuck.display();
        wildDuck.CanEat();
        System.out.println("===========禽流感===========");
        pekingDuck.setEatBehavior(new CanNotEatBehavior());
        pekingDuck.display();
        pekingDuck.CanEat();
        System.out.println("===========北京鸭检疫通过===========");
        pekingDuck.setEatBehavior(new CanEatBehavior());
        pekingDuck.display();
        pekingDuck.CanEat();
    }
}
