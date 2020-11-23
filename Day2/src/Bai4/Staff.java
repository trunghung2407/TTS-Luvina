/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author X1 GEN 4
 */
public class Staff extends Person{
    
    private String school;
    private double salary;
    
    public Staff(String name, String address) {
        super(name, address);
    }

    public Staff(String school, double salary, String name, String address) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double upToSalary(int percent){
        return salary*percent/100;
    }
}
