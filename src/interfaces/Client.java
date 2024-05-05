package interfaces;

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI=new YesBank();
        PhonePay phonePay=new PhonePay(bankAPI);
        phonePay.checkBalance();
    }
}
