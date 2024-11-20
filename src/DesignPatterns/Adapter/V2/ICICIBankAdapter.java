package DesignPatterns.Adapter.V2;

public class ICICIBankAdapter implements BankAPI{
    private ICICIBankAPI icicIBankAPI = new ICICIBankAPI();
    @Override
    public int getBalance() {
        return icicIBankAPI.checkBalance();
    }

    @Override
    public void transferMoney() {
        icicIBankAPI.transfer();
    }
}
