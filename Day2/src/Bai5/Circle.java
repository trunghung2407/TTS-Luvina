/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author X1 GEN 4
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius=0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    @Override  
    public double getArea(){
        return 0;
    }
    
    @Override
    public double getPerimenter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
