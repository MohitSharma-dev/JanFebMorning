package DesignPatterns.Adapter.V2;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTag fastTag;
    private UPI upi;
    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
        fastTag = new FastTag();
        upi = new UPI();
    }
    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount, bankAPI);
    }

    public boolean UPITransfer(int amount){
        return  upi.transfer(amount, bankAPI);
    }
}
