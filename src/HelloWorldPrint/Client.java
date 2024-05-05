package HelloWorldPrint;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter task1=new HelloWorldPrinter();
        Thread t=new Thread(task1);
        t.start();
        System.out.println("Thread: " +Thread.currentThread().getName());
    }
}
