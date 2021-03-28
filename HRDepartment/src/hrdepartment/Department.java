/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrdepartment;

/**
 *
 * @author wwstudent
 */
public class Department {

    //Fields 
    private String name;

    private Employee[] employees = new Employee[10];
    private int lastAddedEmployeeIndex = -1;

    // Constructors
    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee Emp) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = Emp;
        }
    }
    // Methods

    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];

        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employee getEmployeeByID(int empId) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getId() == empId) {
                    return emp;
                }
            }

        }
        return null;
    }

    //    public void setEmployees(Employee[] employees) {
    //        this.employees = employees;
    //    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAvgSalary() {
        if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex + 1);
        }
        return 0.0;
    }

    public String ToString() {
        return name;
    }
}
