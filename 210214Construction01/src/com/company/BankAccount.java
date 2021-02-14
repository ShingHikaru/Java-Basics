package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    public BankAccount() {
        this("56789", 2.50, "Shing", "fiveh.5h@gmail.com",
                "080-7730-9347");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email,
                       String phoneNum) {
        System.out.println("With parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;

    }

}

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
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void depositFunds (int depositFunds) {
        this.balance += depositFunds;
        System.out.println("Deposit of" + depositFunds + "made.New balance is " + balance);
    }
    public void withdrawalFunds (int withdrawalFunds) {
        if (this.balance - withdrawalFunds < 0) {
            System.out.println("You don't have enough money.");
        }else if (this.balance - withdrawalFunds >= 0) {
            this.balance -= withdrawalFunds;
            System.out.println("Withdrawal of" + withdrawalFunds + "processed.Remaining balance is" + balance);

    }



}
