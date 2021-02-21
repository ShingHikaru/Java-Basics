package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("10240");
        bankAccount.setEmail("fiveh.5h@gamil.com");
        bankAccount.setBalance(190034);
        bankAccount.setCustomerName("H.Shing");

        System.out.println("Your name is " + bankAccount.getCustomerName());
        System.out.println("Your account number is " + bankAccount.getAccountNumber());
        bankAccount.depositFunds(1960);
        bankAccount.withdrawalFunds(190035);

    }
}
