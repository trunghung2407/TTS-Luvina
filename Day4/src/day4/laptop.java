/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author X1 GEN 4
 */
public class laptop implements Comparable<laptop>{
    String Brand;
    String CPU; 
    String Ram; 
    String HDD;
    String Display;
    String Pin;
    String Weight;
    String Color;

    public laptop(String Brand, String CPU, String Ram, String HDD, String Display, String Pin, String Weight, String Color) {
        this.Brand = Brand;
        this.CPU = CPU;
        this.Ram = Ram;
        this.HDD = HDD;
        this.Display = Display;
        this.Pin = Pin;
        this.Weight = Weight;
        this.Color = Color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String Display) {
        this.Display = Display;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return Brand+" "+ CPU+" "+ Color+" "+Display+" "+HDD+" "+Pin+" "+Ram+" "+Weight;
    }

    @Override
    public int compareTo(laptop o) {
        return this.Brand.compareTo(o.Brand);
    }
    
}
