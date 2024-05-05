package ProducerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    Store(int maxSize){
        this.maxSize=maxSize;
        this.items=new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize(){
        return maxSize;
    }

    public  ConcurrentLinkedDeque<Object> getItems(){
        return items;
    }

    public void addItem(){
        System.out.println("Producer production time,Current Size"+ this.items.size());
        this.items.add(new Object());
    }
    public void removeItem(){
        System.out.println("Consumer consuming time, current size"+this.items.size());
        this.items.remove();
    }
}
