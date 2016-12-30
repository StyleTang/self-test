package proxy.stati;

import proxy.base.ISubject;

/**
 * Created by tangjie
 * 2016/12/30
 * styletang.me@gmail.com
 */
public class ISubjectImplProxy implements ISubject {
    ISubject iSubjectInner;
    public ISubjectImplProxy(ISubject iSubject){
        iSubjectInner = iSubject;
    }
    @Override
    public void request() {
        System.out.println("test before");
        iSubjectInner.request();
        System.out.println("test after");

    }
}
