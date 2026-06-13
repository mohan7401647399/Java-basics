package org.example;

public class FullTimeEmployee extends Employee {

    private final double monthlySalary;

    public FullTimeEmployee(int employeeId, String employeeName, int monthlySalary) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
