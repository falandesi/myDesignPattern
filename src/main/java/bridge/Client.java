package bridge;

import lombok.val;

public class Client {
    public static void main(String[] args) {
        Phone foldPhone = new FoldPhone(new XiaoMi());
        foldPhone.open();
        foldPhone.call();
        foldPhone.close();

        System.out.println("==========================");

        Phone foldPhone2 = new FoldPhone(new HuaWei());
        foldPhone2.open();
        foldPhone2.call();
        foldPhone2.close();

        System.out.println("==========================");

        Phone slidePhone = new SlidePhone(new XiaoMi());
        slidePhone.open();
        slidePhone.call();
        slidePhone.close();

        System.out.println("==========================");

        Phone slidePhone2 = new SlidePhone(new XiaoMi());
        slidePhone2.open();
        slidePhone2.call();
        slidePhone2.close();
    }
}
