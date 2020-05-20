package singleton.type3;

//单例模式 懒汉式线程不安全
public class SingletonType3 {
    public static void main(String[] args) {
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();
        System.out.println(singletonTest1 == singletonTest2);
        System.out.println("singletonTest1 hashcode:" + singletonTest1.hashCode());
        System.out.println("singletonTest2 hashcode:" + singletonTest1.hashCode());
    }
}

class SingletonTest {
    private static SingletonTest instance;
    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        if(instance == null) {
            instance = new SingletonTest();
        }

        return instance;
    }
}
