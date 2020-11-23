/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author X1 GEN 4
 */
public class Student {
    private String name;
    private int age;
    private double score;
    private Address address;

    public Student() {
        
    }

    public Student(String name, int age, double score, Address address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", score=" + score + ", address=" + address.toString() + '}';
    }
    
    
}
