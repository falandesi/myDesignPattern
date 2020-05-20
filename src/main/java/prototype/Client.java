package prototype;

// 基础实现 克隆羊
public class Client {
    public static void main(String[] args) {
        Sheep douLi = new Sheep("多利", 8, "grey");
        Sheep douLi2 = new Sheep(douLi.getName(), douLi.getAge(), douLi.getColor());
        Sheep douLi3 = new Sheep(douLi.getName(), douLi.getAge(), douLi.getColor());
        Sheep douLi4 = new Sheep(douLi.getName(), douLi.getAge(), douLi.getColor());
        Sheep douLi5 = new Sheep(douLi.getName(), douLi.getAge(), douLi.getColor());

        System.out.println(douLi);
        System.out.println(douLi2);
        System.out.println(douLi3);
        System.out.println(douLi4);
        System.out.println(douLi5);

    }

}
