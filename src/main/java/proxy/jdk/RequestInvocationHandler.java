package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by tangjie on 16/6/7.
 * public final BaseClass$ProxyN extends BaseClass implements BaseInterface
 * 仅支持 interface
 * JVM根据反射等机制动态的生成
 * 字节码是由 JVM 在运行时动态生成（非预存在于任何一个 .class 文件）
 * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
 * @link http://www.ibm.com/developerworks/cn/java/j-lo-proxy1/
 */
public class RequestInvocationHandler implements InvocationHandler {

    private Object target;

    public RequestInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("before request"); // before action

        Object result = method.invoke(target, args);

        System.out.println("after request"); // after action

        return result;
    }
}