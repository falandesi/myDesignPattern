package bridge;

public class FoldPhone extends Phone {
    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }
}
