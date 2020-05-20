package decorate;

public class Cream extends Decorate {
    public Cream(Drink obj) {
        super(obj);
        this.setDes(" 奶油 ");
        this.setPrice(5.0F);
    }
}
