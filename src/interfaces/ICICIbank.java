package interfaces;

public class ICICIbank implements BankAPI{
    @Override
    public int getBalance(int accNumeber) {
        return 0;
    }

    @Override
    public void transferMoney(int from, int to, int amt) {
        System.out.println("ICICI Bank is sending amount");
    }
}
