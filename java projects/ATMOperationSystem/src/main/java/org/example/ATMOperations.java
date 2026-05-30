package org.example;

import java.util.Map;
import java.util.TreeMap;

public class ATMOperations implements ATMOperationInterface {

    ATM atm = new ATM();
    Map<Double, String> miniStatement = new TreeMap<Double, String>();

    @Override
    public void viewBalance() {
        System.out.println("Your current balance is: " + atm.getBalance());
    }

    @Override
    public void depositAmount(double depositAmount) {
        miniStatement.put(depositAmount, "Amount Deposited");
        atm.setBalance(atm.getBalance() + depositAmount);
        System.out.println("You have deposited: " + depositAmount);
    }

    @Override
    public void withdrawAmount(double amount) {
        if(amount % 500 == 0) {
            if (amount <= atm.getBalance()) {
                miniStatement.put(amount, "Amount Withdrawn");
                atm.setBalance(atm.getBalance() - amount);
                System.out.println("You have withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance. Your current balance is: " + atm.getBalance());
            }
        } else {
            System.out.println("Please enter the amount in multiples of 500.");
        }
    }

    @Override
    public void miniStatement() {
        System.out.println("Mini statement:");
        for(Map.Entry<Double, String> entry : miniStatement.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
