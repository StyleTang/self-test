package rpc;

/**
 * Created by tangjie on 16/8/22.
 */

public class RpcProvider {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
