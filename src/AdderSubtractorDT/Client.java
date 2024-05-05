package AdderSubtractorDT;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v=new Value();
        Adder x=new Adder(v);
        Subtractor y=new Subtractor(v);

        ExecutorService ex= Executors.newCachedThreadPool();
       Future<Void>adderFuture= ex.submit(x);
        Future<Void> subtractorFuture= ex.submit(y);

        adderFuture.get();
       subtractorFuture.get();

        System.out.println(v.value);
    }
}