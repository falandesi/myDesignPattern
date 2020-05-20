package singleton.type2;

//单例模式 饿汉式静态代码块
public class SingletonType2 {
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

    private static SingletonTest instance;

    static {
        instance = new SingletonTest();      //把初始话放在一个静态代码块中
    }

    public static SingletonTest getInstance() {
        return instance;
    }
}
