package com.company;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositFunds) {
        this.balance += depositFunds;
        System.out.println("Deposit of " + depositFunds + "made. New balance is " + this.balance);
    }

    public void withdrawalFunds(int withdrawalFunds) {
        if (this.balance < withdrawalFunds) {
            System.out.println("Only " + this.balance + "available. Withdrawal is not processed.");
        }else if(this.balance > withdrawalFunds) {
            this.balance -= withdrawalFunds;
            System.out.println("Withdrawal of " + withdrawalFunds + "processed. Remaining balance is " + this.balance);
        }
    }

}
