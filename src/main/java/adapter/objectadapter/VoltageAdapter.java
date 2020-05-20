package adapter.objectadapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VoltageAdapter implements IVoltage5v {
    public Voltage220V voltage220V;
    @Override
    public int output5V() {
        int disV = 0;
        if(null != voltage220V) {
            int srcV= this.voltage220V.output220V();
            disV = srcV / 44;
            System.out.println(" 转换后电压" + disV + "V");
        }

        return disV;
    }
}
