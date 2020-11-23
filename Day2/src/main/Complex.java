/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author X1 GEN 4
 */
public class Complex {
    private float pt,pa;
    
    public Complex(){
        this.pt=0;
        this.pa=0;
    }
    
    public Complex(float pt,float pa){
        this.pt=pt;
        this.pa=pa;
    }
    
    public Complex(Complex a){
        this.pt=a.pt;
        this.pa=a.pa;
    }

    public void setPt(float pt) {
        this.pt = pt;
    }

    public void setPa(float pa) {
        this.pa = pa;
    }

    public float getPt() {
        return pt;
    }

    public float getPa() {
        return pa;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.pt=sc.nextFloat();
        this.pa=sc.nextFloat();
        
    }
    public Complex cong(Complex a,Complex b){
        a.pt+=b.pt;
        a.pa+=b.pa;
        return a;
    }
    
    public Complex cong(Complex a){
        a.pt+=a.pt;
        a.pa+=a.pa;
        return a;
    }
    
    public Complex tru(Complex a,Complex b){
        a.pt-=b.pt;
        a.pa-=b.pa;
        return a;
    }
    
     public Complex tru(Complex a){
        a.pt-=a.pt;
        a.pa-=a.pa;
        return a;
    }
            
   
}
