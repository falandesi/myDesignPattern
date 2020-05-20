package strategy;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.canEat();
    }
}
