package adapter.objectadapter;

public class Phone {
    public void chargePhone(IVoltage5v iVoltage5v) {
        if(iVoltage5v.output5V() == 5) {
            System.out.println(" 电压符合，可以充电 ");
        } else {
            System.out.println(" 电压不符合，不可以充电 ");
        }

    }
}
