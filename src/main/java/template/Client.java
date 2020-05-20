package template;

public class Client {
    public static void main(String[] args) {
        SoyMilk readBeansSoyMilk = new ReadBeansSoyMilk();
        System.out.println("=======开始制作红豆豆浆==========");
        readBeansSoyMilk.make();

        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        System.out.println("=======开始制作花生豆浆==========");
        peanutSoyMilk.make();
    }
}
