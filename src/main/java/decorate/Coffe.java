package decorate;

public class Coffe extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
