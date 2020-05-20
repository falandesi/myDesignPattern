package builder.improve;

public class Client {

    public static void main(String[] args) {
        // 盖普通房子
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        houseDirector.constructHouse();

        System.out.println("============================================");
        // 盖高楼
        houseDirector.setHouseBuilder(new HighHouse());
        houseDirector.constructHouse();
    }
}
