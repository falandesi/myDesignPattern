package singleton.type8;

//单例模式 枚举 作者推荐
public class SingletonType8 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashcode:" + instance1.hashCode());
        System.out.println("instance2 hashcode:" + instance2.hashCode());

        instance1.test();
    }
}

enum Singleton {
    INSTANCE;
    public void test() {
        System.out.println("test");
    }
}
