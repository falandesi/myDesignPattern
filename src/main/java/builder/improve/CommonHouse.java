package builder.improve;

// 具体建造者
public class CommonHouse extends HouseBuilder{
    @Override
    public void layFoundation() {
        System.out.println(" 普通房子打10m地基 ");
    }

    @Override
    public void masonryWall() {
        System.out.println(" 普通房子砌10cm墙 ");
    }

    @Override
    public void coping() {
        System.out.println(" 普通房子盖顶 ");
    }
}
