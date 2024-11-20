package DesignPatterns.Adapter.V2;

public class BankAPIFactory {
    public static BankAPI getBankAPI(String BankName) {
        BankAPI bankAPI = null;

        if(BankName.equals("ICICI")){
            bankAPI = new ICICIBankAdapter();
        } else if(BankName.equals("YesBank")){
            bankAPI = new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}
