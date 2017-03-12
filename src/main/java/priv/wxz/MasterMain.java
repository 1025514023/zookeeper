package priv.wxz;

import org.apache.zookeeper.KeeperException;

import java.io.IOException;

/**
 * Created by wangxizhong on 17/2/26.
 */
public class MasterMain {
    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
        Master master = new Master("localhost:2181");
        master.startZK();
        master.runForMaster();
        master.getWorkers();
       // master.bootstrap();
        //master.masterExists();
       // if(master.isLeader){
           // System.out.println("I'm the leader");
            //wait for a bit
            Thread.sleep(30000);
      //  }else{
           // System.out.println("Some one else is the leader");
       // }
        //master.stopZK();
   }
}
