package DesignPatterns.Adapter.V1;

public class ICICIBankAPI implements BankAPI{
    public int getBalance(){
        return 100;
    }

    public void transferMoney(){
        System.out.println("Transferred via ICICI Bank");
    }
}
