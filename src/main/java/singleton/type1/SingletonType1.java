package singleton.type1;

//单例模式 饿汉式静态常量
public class SingletonType1 {
    public static void main(String[] args) {
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();
        System.out.println(singletonTest1 == singletonTest2);
        System.out.println("singletonTest1 hashcode:" + singletonTest1.hashCode());
        System.out.println("singletonTest2 hashcode:" + singletonTest1.hashCode());
    }
}

class SingletonTest {
    private SingletonTest() {
    }

    private final static SingletonTest instance = new SingletonTest();

    public static SingletonTest getInstance() {
        return instance;
    }
}
