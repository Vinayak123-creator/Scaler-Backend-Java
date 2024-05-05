package AdderSubtractorDT;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    Subtractor(Value x){
        v=x;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 5000; i++) {
            this.v.value.addAndGet(-i);
        }
        return null;
    }
}
