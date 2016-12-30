package rpc;

/**
 * Created by tangjie on 16/8/22.
 */
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello " + name;
    }

}
