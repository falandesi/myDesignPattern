package adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5v {
    @Override
    public int output5V() {
        int srcV= this.output220V();
        int disV = srcV / 44;
        System.out.println(" 转换后电压" + disV + "V");
        return disV;
    }
}
