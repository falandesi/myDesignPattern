package bridge;

public class SlidePhone extends Phone {
    public SlidePhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println(" 滑盖样式手机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(" 滑盖样式手机 ");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(" 滑盖样式手机 ");
    }
}
