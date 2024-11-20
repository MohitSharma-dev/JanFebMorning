package DesignPatterns.Adapter.V2;

import DesignPatterns.Adapter.V0.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI;

    YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public int getBalance() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void transferMoney() {
        yesBankAPI.moneyTransfer();
    }
}
