package AdaptorDesignPattern;

public class YesBankAPIAdaptor implements BankAPI{
    YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void moneyTransfer() {
        yesBankAPI.transferMoney();
    }
}
