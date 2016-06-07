package proxy.cglib;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.common.ISubject;

import java.lang.reflect.Method;

/**
 * Created by tangjie on 16/6/7.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    private Object object;
    MyMethodInterceptor(Object object){
        this.object = object;
    }

    @Override public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("test before");
        Object result =  methodProxy.invoke(object,objects);
        System.out.println("test after");
        return result;
    }
}
