/**  
 * @Title: Producer.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-06 08:45:53 
 */  

package ProdCons;

/**
 * @author renzheng
 *
 */

import java.util.Queue;

public class Producer implements Runnable {
    Queue<String> bages;
    int size;

    public Producer(Queue<String> bages, int size) {
        this.bages = bages;
        this.size = size;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            synchronized (bages) {
                while (bages.size() == size) {
                    System.out.println("背包已经装满了");
                    try {
                        bages.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("当前生产者数量为："+i);
                bages.add("bages"+i);
                //唤醒消费者
                bages.notifyAll();

            }

        }


    }
}