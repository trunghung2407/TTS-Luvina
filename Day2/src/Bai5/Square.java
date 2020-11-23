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
public class Square extends Rectangle{
    
    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        this.width=side;
        this.length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length=side;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double side) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double side) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" + '}';
    }
    
    
    
    
}
