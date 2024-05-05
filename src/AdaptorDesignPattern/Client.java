package AdaptorDesignPattern;

public class Client {
    public static void main(String[] args) {
//        PhonePe phonePe=new PhonePe(new YesBankAPI());

        BankAPI b= new YesBankAPIAdaptor();
        PhonePe phonePe=new PhonePe(b);
    }
}
