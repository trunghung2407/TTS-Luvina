/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author X1 GEN 4
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    
    public static void cau1(){
        System.out.println("----------Cau1----------");
        int n=34;
        if(n<=3){
            System.out.println(n+" la so nguyen to");
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(n+" khong la so nguyen to");
                    return;
                }
            }
        }
        System.out.println(n+" la so nguyen to");
    }
    
    public static void cau2(){
        System.out.println("----------Cau2----------");
        int[] A = {1,3,5,6,7};
        int max = A[0];
        int min = A[0];
        for(int i=1;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
            if(min>A[i]){
                min=A[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }
    public static void cau3(){
        System.out.println("----------Cau3----------");
        int A[] = {1,2,4,3,5,6,9,4,9};
        int max = A[0];
        int count =1;
        for(int i=1;i<A.length;i++){
            if(max==A[i]){
                count++;
            }
            if(max<A[i]){
                max=A[i];
                count=1;
            }
        }
        if(count>1){
            System.out.print("Max= "+max+"; Soluong= "+count+"; cac vitri= ");
            int temp=0;
            for(int i=1;i<A.length;i++){
                if(A[i]==max){
                    temp++;
                    System.out.print(i);
                    if(temp==count){
                       System.out.println(".");
                   }else{
                       System.out.print(", ");
                   }
                }

            }
        }else{
            System.out.println("Max= "+max);
        }
    }
    
    public static void cau4() {
        System.out.println("------Cau4.1-------");
        int[] A = {1,2,3,4,5,4,6,7,1,2,3,4,5};
        boolean check = true;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                System.out.println("A khong phai day tang dan");
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("A la day tang dan");
        }
        System.out.println("---------Cau4.2---------");
        int start=0;
        int end=0;
        int count=0;
        int maxend=0;
        int maxstart=0;
        int maxcount=0;
        int count_s=1;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]){
                end=i+1;
                count++;
            }else{
                count=0;
                start=i+1;
                end=i+1;
            }
            if(count==maxcount){
                count_s++;
            }
            if(count>maxcount){
                maxstart=start;
                maxend = end;
                maxcount=count;
                count_s=1;
            }
        }
        System.out.println(maxstart+"->"+maxend);
     System.out.println("----------Cau4.3----------");
     start=0;
     end=0;
     count=0;
     int temp=0;
     if(count_s==1){
         System.out.println("Do dai cua doan = "+(maxend-maxstart+1)+";[dau:"+maxstart+"],[cuoi= "+maxend+"]");
     }else{
         System.out.print("So doan= "+count_s+"; Do dai cua doan = "+(maxend-maxstart+1)+";{");
        for(int i=0;i<A.length-1;i++){
               if(A[i]<A[i+1]){
                   end=i+1;
                   count++;
               }else{
                   count=0;
                   start=i+1;
                   end=i+1;
               }
               if(count==maxcount){
                   System.err.println(count+"--"+maxcount);
                   System.out.print("[dau:"+start+"],[cuoi= "+end+"]");
                   temp++;
                    if(temp==count_s){
                        System.out.println("}.");
                    }else{
                        System.out.println(";");
                    }
               }
           }
     }
     
    }
    
    public static void chenx(){
        int x= 11;
        int []A={1,5,8,10,14,17,20,45,90};
        A[A.length-1]=x;
        for(int i=A.length-2;i>=0;i--){
            if(A[i]>x){
                A[i+1]=A[i];
            }else{
                A[i+1]=x;
                break;
            }
        }
        A[0]=(A[0]>x) ? x:A[0] ;
        System.out.println(Arrays.toString(A));
    }
    
    public static void nhiphan01(){
        //dung while
        int []A={1,5,5,8,10,14,17,20,45,90};
        int x=5;
        int l=0, r=A.length-1,m=(l+r)/2;
        while(l<=r){
            m=(l+r)/2;
            if(A[m]==x){
                break;
            }else{
                if(A[m]<x){
                    l=m+1;
                }else{
                    r=m-1;
                }
                
            }
            
        }
        if(A[m]==x){
            System.out.println("Thay");
            int i=m;
            while(A[i]==x){
                System.out.print(i+",");
                i--;
            }
            i=m+1;
            while(A[i]==x){
                System.out.print(i+",");
                i++;
            }
        }else{
            System.out.println("ko thay");
        }
    }
    //dung quy nap
    public static int []A={1,5,5,8,10,14,17,20,45,90};
    public static void nhiphan02(int x,int l, int r){
        int m=(l+r)/2;
        while(l<=r){
            m=(l+r)/2;
            if(A[m]==x){
                break;
            }else{
                if(A[m]<x){
                    l=m+1;
                }else{
                    r=m-1;
                }
                
            }
            
        }
        if(A[m]==x){
            System.out.println("Thay");
            System.out.println("Thay");
            int i=m;
            while(A[i]==x){
                System.out.print(i+",");
                i--;
            }
            i=m+1;
            while(A[i]==x){
                System.out.print(i+",");
                i++;
            }
        }else{
            System.out.println("ko thay");
        }
    }
    
    public static int[] A1 = {1,9,8,4,3,7,5,6,11,0,15};
    public static void SX1(int f){
        int min = A1[f];
        int vt=f;
        for(int i =f+1;i<A1.length;i++){
            if(A1[i]<min){
                min=A1[i];
                vt=i;
            }
        }
        A1[vt]=A1[f];
        A1[f]=min;
        if(f==A1.length-1){
            System.out.println(Arrays.toString(A1));
            return;
        }else{
            SX1(f+1);
        }
    }
    
    public static void SX2(){
        for(int i =A1.length-1;i>0;i--){
            for(int j=A1.length-1;j>A1.length-1-i;j--){
                if(A1[j]>A1[j-1]){
                    int temp =A1[j];
                    A1[j]=A1[j-1];
                    A1[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(A1));
    }
    
    public static void SX3(){
        int i=0;
        while(i<A1.length-1){
            int j=A1.length-1;
            while(j>i){
                if(A1[j]<A1[j-1]){
                    int temp = A1[j];
                    A1[j]=A1[j-1];
                    A1[j-1]=temp;
                }
                j--;
            }
            i++;
        }
        System.out.println(Arrays.toString(A1));
    }
    public static void SX4(){
        int[] A4={15, 11, 9, 8, 7, 6, 5, 4, 3, 1, 16};
        for(int i=1;i<A4.length;i++){
            int temp = A4[i];
            for(int j=i-1;j>=0;j--){
                if(A4[j]>temp){
                    A4[j+1]=A4[j];
                }else{
                    A4[j+1]=temp;
                    break;
                }
                
            }
            if(A4[0]>temp){
                A4[0]=temp;
            }
        }
        System.out.println(Arrays.toString(A4));
    }

    
    public static void main(String[] args) {
        SX1(0);
        SX2();
        SX4();
        
    
    }
    
}
