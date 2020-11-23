/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author X1 GEN 4
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ListBinarySearch {
 public static void main(String[] args)  {   
     List<Student> lst = new ArrayList<Student>();// sx theo ten
         lst.add(new Student("A05726","AA", 8));
         lst.add(new Student("A06338","AC", 7));
         lst.add(new Student("A05379", "AC",5));
         lst.add(new Student("A06338","AB1", 7));
         lst.add(new Student("A06178", "AD",9));  
         System.out.println(lst); 
         //1 Menu -- Sắp theo tên 
        Collections.sort(lst);// Sort by name       
        Student st1=new Student("......","AC", 12);//Nhap SV can tim kiem  (thay)               
        int i= Collections.binarySearch(lst, st1);// Search  by name 
        // Lam sao để tìm được tất cả
        System.out.println("index="+i);
        if (i>=0) {   
             System.out.println("Found by name");    
             System.out.println(lst.get(i));         
         }
        // 2. Menu Sắp xếp theo điểm
        // 2 Sap xep theo Score de chuan bi cho tim kiem nhi phan theo Score
          Collections.sort(lst, new  Comparator <Student>(){ 
            public int compare(Student a, Student b){                     
                     return a.getScore().compareTo(b.getScore());
                   }
            } );  
           System.out.println(lst); 
          st1=new Student("......","AC", 7);//Nhap SV can tim kiem  
      // 3 Tim kiem nhi phan theo Score
          i= Collections.binarySearch(lst, st1, new Comparator<Student> (){   @Override
              public int compare(Student a, Student b) {
                  return a.getScore().compareTo(b.getScore());
              } });// tim theo score
         System.out.println("index="+i);
         if (i>=0) {    
             System.out.println("Found by score:");    
             int j=i;
             while (j<lst.size() && lst.get(j).getScore()==7){
                System.out.println(lst.get(j));  
                j++;
             };
             j=i-1;
             while (j>=0 && lst.get(j).getScore()==7){
                System.out.println(lst.get(j));  
                j--;
             };
         }
     }
}
