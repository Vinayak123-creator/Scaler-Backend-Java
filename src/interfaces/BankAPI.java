package interfaces;

public interface BankAPI {
    int getBalance(int accNumeber);

    void transferMoney(int from,int to,int amt);
}
