package adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("===== 采用类适配器模式 =====");
        Phone phone = new Phone();
        phone.chargePhone(new VoltageAdapter());
    }
}
