package proxy.cglib;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Getter
@Setter
@AllArgsConstructor
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    // 返回对象的代理
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(this.target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(" Cglib代理开始...... ");
        Object returnVal = method.invoke(this.target, objects);
        System.out.println(" Cglib代理提交...... ");
        return returnVal;
    }
}
