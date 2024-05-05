package ProducerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService es= Executors.newCachedThreadPool();
        Semaphore prodSema=new Semaphore(5);
        Semaphore consSema= new Semaphore(0);
        Store store=new Store(5);
        for(int i=1;i<=8;i++){
            es.execute(new Producer(store,prodSema,consSema));
        }
        for(int i=1;i<=20;i++){
            es.execute(new Consumer(store,prodSema,consSema));
        }
    }
}
