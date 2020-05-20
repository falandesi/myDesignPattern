package prototype.deepclone;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Client {
    public static void main(String[] args) throws Exception {
        DeepPrototype deepPrototype = new DeepPrototype("prototype", new DeepCloneTarget("full", "simple"));
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.clone();

        System.out.println("采用第一种方法进行深拷贝：");
        System.out.println(deepPrototype.deepCloneTarget.hashCode());
        System.out.println(deepPrototype2.deepCloneTarget.hashCode());

        DeepPrototype deepPrototype3 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println("采用第二种方法进行深拷贝：");
        System.out.println(deepPrototype.deepCloneTarget.hashCode());
        System.out.println(deepPrototype3.deepCloneTarget.hashCode());

    }
}
