package priv.wxz;

import java.io.IOException;

/**
 * Created by wangxizhong on 17/2/27.
 */
public class ClientMain {
    public static void main(String[] args) throws Exception {
        Client client = new Client("localhost:2181");
        client.startZK();
        String name = client.queueCommand("1");
        System.out.println("Created" + name);
    }
}
