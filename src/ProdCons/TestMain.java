/**  
 * @Title: TestMain.java
 * @Description: TODO(描述)
 * @author author
 * @date 2020-09-06 08:47:28 
 */  

package ProdCons;

/**
 * @author renzheng
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class TestMain {
    public static void main(String[] args) {

        Queue<String> a = new LinkedList<>();
        int size = 10;
        Consumer consumer = new Consumer(a, size);
        Producer producer = new Producer(a, size);
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t2.start();
        t1.start();



    }
}