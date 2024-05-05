package AdaptorDesignPattern;

public class ICICIBankAPIAdaptor implements BankAPI{
    ICICIBankAPI iciciBankAPI=new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return iciciBankAPI.findBalance();
    }

    @Override
    public void moneyTransfer() {
        iciciBankAPI.fundTransfer();
    }
}
