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
public class Employee {
    
    //Fields
    private int id;
    private double salary;
    String name;
 
    // Constructor
    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    
   //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    
    
    // Methods

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String ToString()
    {
        
    }
            
    
}
