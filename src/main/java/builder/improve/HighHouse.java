package builder.improve;

// 具体建造者
public class HighHouse extends HouseBuilder {
    @Override
    public void layFoundation() {
        System.out.println(" 高楼打30m地基 ");
    }

    @Override
    public void masonryWall() {
        System.out.println(" 高楼砌20cm墙 ");
    }

    @Override
    public void coping() {
        System.out.println(" 高楼盖玻璃房顶 ");
    }
}
