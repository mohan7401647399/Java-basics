package org.example;

public class ATM {
    private double balance;
    private double withdrawAmount;
    private double depositAmount;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawlAmount() {
        return withdrawAmount;
    }

    public void setWithdrawlAmount(double withdrawlAmount) {
        this.withdrawAmount = withdrawlAmount;
    }

    public double getDepositeAmount() {
        return depositAmount;
    }

    public void setDepositeAmount(double depositeAmount) {
        this.depositAmount = depositeAmount;
    }
}
