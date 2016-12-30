package proxy;

import net.sf.cglib.proxy.Enhancer;
import proxy.base.ISubject;
import proxy.base.ISubjectImpl;
import proxy.cglib.MyMethodInterceptor;
import proxy.jdk.RequestInvocationHandler;
import proxy.stati.ISubjectImplProxy;

import java.lang.reflect.Proxy;

/**
 * Created by tangjie
 * 2016/12/30
 * styletang.me@gmail.com
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("======no proxy begin====");
        ISubject iSubjectToBeProxy = new ISubjectImpl();
        iSubjectToBeProxy.request();

        System.out.println("======static proxy begin====");
        ISubject iSubjectStatic = new ISubjectImplProxy(iSubjectToBeProxy);
        iSubjectStatic.request();

        System.out.println("======jdk proxy begin====");
        ISubject subjectJdk = (ISubject) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[]{ISubject.class},
                new RequestInvocationHandler(iSubjectToBeProxy)
        );
        subjectJdk.request();


        System.out.println("======cglib proxy interface begin====");
        ISubject iSubjectInterface = (ISubject) Enhancer.create(ISubject.class, new MyMethodInterceptor(iSubjectToBeProxy));
        iSubjectInterface.request();

        System.out.println("======cglib proxy class begin====");
        ISubject iSubjectImpl = (ISubjectImpl) Enhancer.create(ISubjectImpl.class, new MyMethodInterceptor(iSubjectToBeProxy));
        iSubjectImpl.request();
    }
}
/**
 ======no proxy begin====
 my request
 ======static proxy begin====
 test before
 my request
 test after
 ======jdk proxy begin====
 before request
 my request
 after request
 ======cglib proxy interface begin====
 test before
 my request
 test after
 ======cglib proxy class begin====
 test before
 my request
 test after
 */