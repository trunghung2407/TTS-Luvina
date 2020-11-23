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
public class Student extends Person{
    
    private String program;
    private int year;
    private double score;
    
    public Student(String name, String address) {
        super(name, address);
    }

    public Student(String program, int year, double score, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.score = score;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return ""+score*year;
    }
    
    
}
