package PrintNumbers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
       // ExecutorService ex= Executors.newFixedThreadPool(10);
        ExecutorService ex= Executors.newCachedThreadPool();
        for(int i=1;i<=100;i++){
            PrintNumber task=new PrintNumber(i);
            Thread t=new Thread(task);
            ex.execute(t);
            //t.start();
        }
    }
}
