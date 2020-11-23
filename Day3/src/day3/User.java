/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author X1 GEN 4
 */
public class User implements Serializable {
    private String username;
    private int age;
    private String address;
    private double score;

    public User(String username, int age, String address, double score) {
        this.username = username;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public User(String username) {
        this.username = username;
        Random rd = new Random();
        this.age=rd.nextInt(90)+6;
        this.address="Every Where";
        this.score =((double)rd.nextInt(100))/10;
        
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return ""+getUsername()+" "+getAddress()+" "+getAge()+" "+getScore();
    }
    
    
    
}
