package DesignPatterns.Adapter.V0;

public class PhonePe {
    private YesBankAPI yesBankAPI;
    private FastTag fastTag;
    private UPI upi;
    PhonePe(){
        yesBankAPI = new YesBankAPI();
        fastTag = new FastTag();
        upi = new UPI();
    }
    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount, yesBankAPI);
    }

    public boolean UPITransfer(int amount){
        return  upi.transfer(amount, yesBankAPI);
    }
}
