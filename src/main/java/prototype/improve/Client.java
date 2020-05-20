package prototype.improve;

// 原型模式 克隆羊
public class Client {
    public static void main(String[] args) {
        Sheep douLi = new Sheep("多利", 8, "grey");
        douLi.setFriend(new Sheep("多芬", 9, "black"));
        Sheep douLi2 = (Sheep) douLi.clone();
        Sheep douLi3 = (Sheep) douLi.clone();
        Sheep douLi4 = (Sheep) douLi.clone();
        Sheep douLi5 = (Sheep) douLi.clone();

        System.out.println(douLi);
        System.out.println(douLi2);
        System.out.println(douLi3);
        System.out.println(douLi4);
        System.out.println(douLi5);

        System.out.println(douLi.getFriend().hashCode());
        System.out.println(douLi2.getFriend().hashCode());
        System.out.println(douLi3.getFriend().hashCode());
        System.out.println(douLi4.getFriend().hashCode());
        System.out.println(douLi5.getFriend().hashCode());

    }

}
