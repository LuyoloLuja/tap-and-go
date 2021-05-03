package com.tapAndGo;

public class MakePayments {
    public static void main(String[] args) {
        TapAndGo tapAndGoObj = new TapAndGo();

        tapAndGoObj.deposit(500);
        tapAndGoObj.pay(100);
        tapAndGoObj.pay(600);
        tapAndGoObj.getBalance();
    }
}
