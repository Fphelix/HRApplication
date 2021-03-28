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
public class HRDepartment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("HRAPP Starts");
        
        Employee e1 = new Employee (230, "Jerry", 333998);    
       Employee e2 = new Employee (420, "Sam", 333458);
       
        
        Department dept = new Department("Education");
        
        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(new Employee(772, "Jack", 2998));
        
        Employee[] emps = dept.getEmployees();
        for(Employee emp: emps)
        {
          System.out.println("Emp " + emp);
   
        }
       System.out.println("Total "  + dept.getTotalSalary());
        System.out.println("Avg "  + dept.getAvgSalary());
        
        System.out.println("Emp" + dept.getEmployeeByID(360));
       
    }
    
}
