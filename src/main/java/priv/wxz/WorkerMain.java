package priv.wxz;

import java.io.IOException;

/**
 * Created by wangxizhong on 17/2/26.
 */
public class WorkerMain {
    public static void main(String [] args) throws InterruptedException, IOException {
        Worker worker=new Worker("localhost:2181");
        worker.startZK();
        worker.register();
        worker.setStatus("working");
        Thread.sleep(300000);
    }
}
