package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to PayRoll Management Project!");
        PayRollManagement pms = new PayRollManagement();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Mohan", 50000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "John", 9, 100);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee(3, "Alex", 30000);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee(4, "Kevin", 5, 60);
        pms.addEmployee(fullTimeEmployee);
        pms.addEmployee(partTimeEmployee);
        pms.addEmployee(fullTimeEmployee2);
        pms.addEmployee(partTimeEmployee2);
        pms.getEmployees();
        System.out.println("After removing employee with id 2");
        pms.removeEmployee(2);
        pms.getEmployees();
    }
}
