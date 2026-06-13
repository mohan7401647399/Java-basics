package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Customer customer1 = new Customer(1, 'A', 'B', 3);
        Customer customer2 = new Customer(2, 'A', 'C', 6);
        Customer customer3 = new Customer(3, 'A', 'D', 9);
        Customer customer4 = new Customer(4, 'A', 'B', 12);

        BookingSystem bookingSystem = new BookingSystem(4);

        bookingSystem.bookTaxi(customer1);
        bookingSystem.bookTaxi(customer2);
        bookingSystem.bookTaxi(customer3);
        bookingSystem.bookTaxi(customer4);

         bookingSystem.displayTaxiDetails();
    }
}
