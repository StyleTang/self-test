package proxy.base;

/**
 * Created by tangjie on 16/6/7.
 */
public class ISubjectImpl implements ISubject {
    @Override public void request() {
        System.out.println("my request");
    }
}
