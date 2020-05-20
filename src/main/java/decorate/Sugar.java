package decorate;

public class Sugar extends Decorate {
    public Sugar(Drink obj) {
        super(obj);
        this.setDes(" 糖 ");
        this.setPrice(1.0F);
    }
}
