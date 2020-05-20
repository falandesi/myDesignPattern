package decorate;

// 瑞幸咖啡店
public class LuckinCoffeStore {

    public static void main(String[] args) {
        // 订单1 单品咖啡 卡布奇诺
        Drink order = new Cappuccino();
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述 = " + order.getDes());
        order = new Milk(order);
        System.out.println("费用2 加入一份牛奶 = " + order.cost());
        System.out.println("描述 加入一份牛奶 = " + order.getDes());
        order = new Sugar(order);
        System.out.println("费用3 加入一份牛奶 加入一份糖 = " + order.cost());
        System.out.println("描述 加入一份牛奶 加入一份糖 = " + order.getDes());

        System.out.println("==================================");

        // 订单2 单品咖啡 意式咖啡
        Drink order2 = new Espresso();
        System.out.println("费用1 = " + order2.cost());
        System.out.println("描述 = " + order2.getDes());
        order2 = new Sugar(order2);
        System.out.println("费用2 加入一份糖 = " + order2.cost());
        System.out.println("描述 加入一份糖 = " + order2.getDes());
        order2 = new Sugar(order2);
        System.out.println("费用2 加入二份糖 = " + order2.cost());
        System.out.println("描述 加入二份糖 = " + order2.getDes());
        order2 = new Cream(order2);
        System.out.println("费用2 加入二份糖 一份奶油 = " + order2.cost());
        System.out.println("描述 加入一份糖 一份奶油 = " + order2.getDes());
    }
}
