package singleton.type7;

//单例模式 静态内部类
public class SingletonType7 {
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

    private static class SingletonInstance {
        private static final SingletonTest INSTANCE = new SingletonTest();

        private SingletonInstance() {
        }
    }

    public static SingletonTest getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
