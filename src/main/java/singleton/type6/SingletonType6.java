package singleton.type6;

//单例模式 双重检查
public class SingletonType6 {
    public static void main(String[] args) {
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();
        System.out.println(singletonTest1 == singletonTest2);
        System.out.println("singletonTest1 hashcode:" + singletonTest1.hashCode());
        System.out.println("singletonTest2 hashcode:" + singletonTest1.hashCode());
    }
}

class SingletonTest {
    private static volatile SingletonTest instance;   // volatile 可以保证立马将变更导入主存中
    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        if(instance == null) {
            synchronized (SingletonTest.class) {      //保证只有一个线程能进入
                if(instance == null) {               //进行双重检查
                    instance = new SingletonTest();
                }
            }
        }

        return instance;
    }
}
