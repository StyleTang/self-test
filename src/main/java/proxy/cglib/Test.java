package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import proxy.common.ISubject;
import proxy.common.ISubjectImpl;

/**
 * Created by tangjie on 16/6/7.
 */
public class Test {
    public static void main(String[] args) {
        ISubject iSubject = (ISubject) Enhancer.create(ISubject.class, new MyMethodInterceptor(new ISubjectImpl()));
        System.out.println(1);
        iSubject.request();
        System.out.println(2);
        ISubjectImpl iSubjectImpl = (ISubjectImpl) Enhancer.create(ISubjectImpl.class, new MyMethodInterceptor(new ISubjectImpl()));
        iSubjectImpl.request();
    }
}
