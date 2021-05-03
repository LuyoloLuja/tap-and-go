package com.tapAndGo;

public class TapAndGo {
    double accountBalance;

    public void pay(double amount){

        if (amount > accountBalance) {
            System.out.print("You have insufficient funds.");
        } else {
            accountBalance -= amount;
            System.out.println("You paid: " + accountBalance);
        }
    }

    public void deposit(double depositedAmount){
        accountBalance += depositedAmount;
    }

    public void getBalance() {
        System.out.print("Your balance is: " + accountBalance);
    }
}
