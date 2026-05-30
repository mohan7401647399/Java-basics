package org.example;

import java.util.ArrayList;
import java.util.List;

public class PayRollManagement {
    private final List<Employee> employees;

    public  PayRollManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void getEmployees() {
        for(Employee emp : employees ){
            System.out.println("Employee Id : " + emp.getEmployeeId() + " EmployeeName : " + emp.getEmployeeName() + " Salary " + emp.calculateSalary());
        }
    }

    public void removeEmployee(int employeeId) {
        Employee removeEmployee = null;

        for(Employee emp: employees) {
            if(emp.getEmployeeId() == employeeId) {
                removeEmployee = emp;
                break;
            }
        }
        if(removeEmployee != null) {
            employees.remove(removeEmployee);
        }
    }
}
