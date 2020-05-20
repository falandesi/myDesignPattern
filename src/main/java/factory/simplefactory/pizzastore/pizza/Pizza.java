package factory.simplefactory.pizzastore.pizza;

public abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    //披萨的制作分4步 准备 烘培 切割 包装 认为不通披萨只有装备是不一样的
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 烘培中...");
    }

    public void cut() {
        System.out.println(name + " 切割中...");
    }

    public void boxing() {
        System.out.println(name + " 打包中...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
