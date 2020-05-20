package builder.improve;

// 抽象建造者
public abstract class HouseBuilder {
    protected House house;
    public abstract void layFoundation();
    public abstract void masonryWall();
    public abstract void coping();

    public House buildHouse() {
        return this.house;
    }
}
