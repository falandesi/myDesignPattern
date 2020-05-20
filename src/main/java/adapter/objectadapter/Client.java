package adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("===== 采用对象适配器模式 =====");
        Phone phone = new Phone();
        phone.chargePhone(new VoltageAdapter(new Voltage220V()));
    }
}
