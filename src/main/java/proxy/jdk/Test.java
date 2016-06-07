package proxy.jdk;

import proxy.common.ISubject;
import proxy.common.ISubjectImpl;

import java.lang.reflect.Proxy;

/**
 * Created by tangjie on 16/6/7.
 */
public class Test {
    public static void main(String[] args) {

        ISubject subject = (ISubject) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[] {ISubject.class},
                new RequestInvocationHandler(new ISubjectImpl())
        );
           subject.request();


    }


}
