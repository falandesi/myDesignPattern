package decorate;

import lombok.AllArgsConstructor;

// 装饰者
@AllArgsConstructor
public class Decorate extends Drink {
    private Drink obj;
    @Override
    public float cost() {
        return super.getPrice() + this.obj.cost();
    }

    public String getDes() {
        return this.des + " " + this.getPrice() + " && " + this.obj.getDes();
    }
}
