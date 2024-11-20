package DesignPatterns.Adapter.V0;

public class YesBankAPI {
    public int balanceCheck(){
        return 100;
    }

    public void moneyTransfer(){
        System.out.println("Money transferred via YesBank");
    }
}
