package DesignPatterns.Adapter.V2;

import java.util.Scanner;

public class Client {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String BankName = sc.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPI(BankName);
        PhonePe phonePe = new PhonePe(bankAPI);
    }
}
