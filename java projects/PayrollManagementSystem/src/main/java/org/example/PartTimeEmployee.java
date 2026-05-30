package org.example;

public class PartTimeEmployee extends Employee {

    private final int hourlyWorked;
    private final int hoursSalary;

    public PartTimeEmployee(int employeeId, String employeeName, int hourlyWorked, int hoursSalary) {
        super(employeeId, employeeName);
        this.hourlyWorked = hourlyWorked;
        this.hoursSalary = hoursSalary;
    }

    @Override
    public double calculateSalary(){
        return hourlyWorked * hoursSalary;
    }
}
