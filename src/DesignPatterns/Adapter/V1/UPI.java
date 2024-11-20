package DesignPatterns.Adapter.V1;

public class UPI {
    public boolean transfer(int amount, BankAPI bankAPI) {
        if(bankAPI.getBalance() >= amount){
            System.out.println("UPI transfer successful");
            return true;
        }
        return false;
    }
}
