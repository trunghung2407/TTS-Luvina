/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author X1 GEN 4
 */
public class Day4 {

    /**
     * @param args the command line arguments
     */
    
    public static void sortbrand(ArrayList<laptop> A){
        Collections.sort(A);
        for (laptop object : A) {
            System.out.println(object.toString());
        }
    }
    public static void sortCPU(ArrayList<laptop> A){
        Collections.sort(A,new Comparator<laptop>(){
            @Override
            public int compare(laptop o1, laptop o2) {
                return o1.CPU.compareTo(o2.CPU);
            }
            
        });
        for (laptop object : A) {
            System.out.println(object.toString());
        }
    }
    
    public static void timkiemHDD(ArrayList<laptop> A,laptop B){
        int i=Collections.binarySearch(A, B,new Comparator<laptop>(){
            @Override
            public int compare(laptop o1, laptop o2) {
                return o1.HDD.compareTo(o2.HDD);
            }
            
        });
        if(i>0){
            int j=i;
            while (j>=0) {                
                if(A.get(j).HDD.equals(B.HDD)){
                    System.out.println(A.get(j).toString());
                }
                j--;
            }
            j=i+1;
            while (j<A.size()) {                
                if(A.get(j).HDD.equals(B.HDD)){
                    System.out.println(A.get(j).toString());
                }
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
//        Tree A = new Tree();
//        A.insertw(47);
//        A.insertw(77);
//        A.insertw(25);
//        A.insertw(11);
//        A.insertw(7);
//        A.insertw(17);
//        A.insertw(43);
//        A.insertw(31);
//        A.insertw(44);
//        A.insertw(65);
//        A.insertw(68);
//        A.insertw(93);
//        System.out.println((A.timkiemw(7)==1)?"Yes":"No");
//        A.postorderTraversal();
//        System.out.println("");
//        A.deletee(77);
//        A.postorderTraversal();
//        ArrayList<laptop> Laptops=new ArrayList<laptop>();
//        for(int i=0;i<10;i++){
//            laptop temp = new laptop("Brand "+i, "CPU "+(9-i), "Ram "+i, "HDD "+(9-i), "Display "+i, "Pin "+(9-i), "Weight "+i, "Color "+(9-i));
//            Laptops.add(temp);
//        }
//        for (laptop Laptop : Laptops) {
//            System.out.println(Laptop.toString());
//        }
//        System.out.println("Sap xep theo brand");
//        sortbrand(Laptops);
//        System.out.println("Sap xep theo cpu");
//        sortCPU(Laptops);
        PriorityQueue<sinhvien> SinhViens=new PriorityQueue<sinhvien>(new Comparator<sinhvien>(){
            @Override
            public int compare(sinhvien o1, sinhvien o2) {
                return o1.NgaySinh.compareTo(o2.NgaySinh);
            }
            
        });
        for(int i=0;i<10;i++){
            sinhvien temp = new sinhvien("Hoten"+i, "NgaySinh"+(9-i), "Quequan"+i, "Nganhhoc"+(9-i), i, "TA"+i);
            SinhViens.add(temp);
            //System.out.println(temp.toString());
        }
        System.out.println(SinhViens.remove().toString());
        while (!SinhViens.isEmpty()) {
            System.out.println(SinhViens.remove().toString());
        } 
    }
    
    
}
