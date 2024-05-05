package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;

    Adder(Value x, Lock lock){
        v=x;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
//        lock.lock();
        for(int i=1;i<=100;i++){
            lock.lock();
            System.out.println("Adder acquired at"+ i);
            this.v.value+=i;
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
