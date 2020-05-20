package decorate;

public class Milk extends Decorate {
    public Milk(Drink obj) {
        super(obj);
        this.setDes(" 牛奶 ");
        this.setPrice(3.0F);
    }
}
