package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by tangjie on 16/6/7.
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