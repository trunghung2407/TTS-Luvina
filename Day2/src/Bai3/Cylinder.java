/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author X1 GEN 4
 */
public class Cylinder extends Circle{
    
    private double height;
    
    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
        return getRadius()*getRadius()*Math.PI*getHeight();
    }
    
}
