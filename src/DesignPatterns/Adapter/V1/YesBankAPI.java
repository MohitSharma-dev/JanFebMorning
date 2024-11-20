package DesignPatterns.Adapter.V1;

public class YesBankAPI implements BankAPI{
    public int getBalance(){
        return 100;
    }

    public void transferMoney(){
        System.out.println("Money transferred via YesBank");
    }
}
