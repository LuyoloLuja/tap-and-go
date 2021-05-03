package com.tapAndGo;

public class TapAndGo {
    double accountBalance;

    public void pay(double amount){

        if (amount > accountBalance) {
            System.out.print("You have insufficient funds.");
        } else {
            accountBalance -= amount;
            System.out.println("You paid: " + amount);
        }
    }

    public void deposit(double depositedAmount){
        accountBalance += depositedAmount;
    }

    public void getBalance() {
        System.out.print( "\n" + "Your balance is: " + accountBalance);
    }
}
