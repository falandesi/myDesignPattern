package builder;


// 基础抽象类
public abstract class AbstractHouse {
    public abstract void layFoundation();
    public abstract void masonryWall();
    public abstract void coping();

    public void build() {
        this.layFoundation();
        this.masonryWall();
        this.coping();
    }
}
