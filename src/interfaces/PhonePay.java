package interfaces;

public class PhonePay {
    BankAPI bankAPI;
    PhonePay (BankAPI bankAPI){
        this.bankAPI=bankAPI;
    }
    public int checkBalance(){
       return bankAPI.getBalance(20);
    }


}
