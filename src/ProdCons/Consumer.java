/**  
 * @Title: Consumer.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-06 08:41:44 
 */  

package ProdCons;

/**
 * @author renzheng
 *
 */

import java.util.Queue;

public class Consumer implements Runnable {
    //背包
    Queue<String> bages;
    //大小
    int size;
    public Consumer(Queue<String> bages, int size) {
        this.bages = bages;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bages) {
                while (bages.isEmpty()) {
                    try {
                        System.out.println("背包空了");
                        bages.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //睡眠1s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String bage = bages.remove();
                System.out.println("当前消费者的数量为：" + bage);

                //唤醒生产者（因为是双向的，又是同一个对象bages下）
                bages.notifyAll();


            }
        }

    }
}