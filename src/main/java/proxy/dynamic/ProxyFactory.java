package proxy.dynamic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Getter
@Setter
@AllArgsConstructor
public class ProxyFactory {
    private Object target;

    //说明
    /*public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
//1. ClassLoader loader : 指定当前目标对象使用的类加载器, 获取加载器的方法固定
//2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
//3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行
    的目标对象方法作为参数传入*/

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println(" JDK代理开始....... ");
            Object returnVal = method.invoke(ProxyFactory.this.target, args);
            System.out.println(" JDK代理提交...... ");
            return returnVal;
        });
    }
}
