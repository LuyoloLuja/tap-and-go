package com.tapAndGo;

public class TapAndGo {
    double accountBalance;

    public void pay(double amount){
        accountBalance -= amount;
        System.out.println("You paid, " + accountBalance);
    }

    public void deposit(double depositedAmount){
        accountBalance += depositedAmount;
        System.out.print("You deposited" + depositedAmount);
    }

    public void getBalance() {
        System.out.print("Your balance is " + accountBalance);
    }
}