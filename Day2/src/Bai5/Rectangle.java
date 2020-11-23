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
public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle() {
        this.length=0;
        this.width=0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }


  
    @Override
    public double getPerimenter() {
        return 0; 
    }

    @Override
    public double getArea() {
        return 0; 
    }
    
    
    
}
