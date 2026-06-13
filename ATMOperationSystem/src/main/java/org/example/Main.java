package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ATMOperationInterface atmOperations = new ATMOperations();

        int atmCardNumber = 123456789;
        int atmPin = 1234;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ATM card Number : ");
        int receivedCardNumber = sc.nextInt();
        System.out.println("Enter the ATM PIN : ");
        int receivedATMPIN = sc.nextInt();

        if(atmCardNumber == receivedCardNumber && atmPin == receivedATMPIN ){
            System.out.println("You have successfully logged in");
            while(true) {
                System.out.println("Please select an option: \n1. View Balance\n2. Deposit Amount\n3. Withdraw Amount\n4. Mini Statement\n5. Exit");
                System.out.println("Enter your choice: ");
                int userInput = sc.nextInt();
                if(userInput == 1) {
                    atmOperations.viewBalance();
                } else if (userInput == 2) {
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atmOperations.depositAmount(depositAmount);
                } else if (userInput == 3) {
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atmOperations.withdrawAmount(withdrawAmount);
                } else if (userInput == 4) {
                    atmOperations.miniStatement();
                } else if (userInput == 5) {
                    System.out.println("Thank you for using our ATM and collect your AMC card. Goodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid card number or PIN. Please try again.");
            System.exit(0);
        }
    }
}
