package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import proxy.base.ISubject;
import proxy.base.ISubjectImpl;

/**
 * Created by tangjie on 16/6/7.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("======proxy interface begin====");
        ISubject iSubjectInterface = (ISubject) Enhancer.create(ISubject.class, new MyMethodInterceptor(new ISubjectImpl()));
        iSubjectInterface.request();

        System.out.println("======proxy class begin====");
        ISubject iSubjectImpl = (ISubjectImpl) Enhancer.create(ISubjectImpl.class, new MyMethodInterceptor(new ISubjectImpl()));
        iSubjectImpl.request();
    }
}
/**
 ======proxy interface begin====
 test before
 my request
 test after
 ======proxy class begin====
 test before
 my request
 test after
 */