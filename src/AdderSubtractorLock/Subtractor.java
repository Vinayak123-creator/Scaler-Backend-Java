package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    Subtractor(Value x,Lock lock){
        v=x;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
//        lock.lock();
        for (int i = 1; i <= 100; i++) {
            System.out.println("Subtractor acquired at"+ i);
            lock.lock();
            this.v.value -= i;
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
