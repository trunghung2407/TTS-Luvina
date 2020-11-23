/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX;

import java.util.StringTokenizer;

/**
 *
 * @author X1 GEN 4
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    
    public static void Bai1() {
        int A[]={10,55,43,77,48,12,53,64,48,81,92,10};
        int max=0,vtd=0,vtc=0,sum=A[0],sl=0,leng=1;
        boolean check = false;
        int [] lvtd = new int[A.length];
        int [] lvtc = new int[A.length];
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                vtc=i;
                sum+=A[i];
                leng++;
            }else{
                if(leng>max&&sum>100){
                    sl=0;
                    lvtd[sl]=vtd;
                    lvtc[sl]=vtc;
                    check=true;
                    max=leng;
                }else if(leng==max&&sum>100){
                    sl++;
                    lvtd[sl]=vtd;
                    lvtc[sl]=vtc;
                }
                vtd=i;
                vtc=i;
                sum=A[i];
                leng=1;
            }
        }
        if(leng>max&&sum>100){
            sl=0;
            lvtd[sl]=vtd;
            lvtc[sl]=vtc;
            check=true;
            max=leng;
        }else if(leng==max&&sum>100){
            sl++;
            lvtd[sl]=vtd;
            lvtc[sl]=vtc;
        }
        if(check){
            System.out.print("("+lvtd[0]+","+lvtc[0]+")");
            for(int i=1;i<=sl;i++){
                System.out.print(";("+lvtd[i]+","+lvtc[i]+")");
            }
        }
        System.out.println("");
    }
    
    public static void Bai2(){
        int A[][]={{1,2,3},{6,8,4},{7,5,9}};
        int k=1;
        boolean check = true;
        for(int i=1;i<A.length;i++){
            if(A[i][k]<A[i-1][k]){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("Cột "+k+" tăng dần");
        }else{
            System.out.println("Cột "+k+" không tăng dần");
        }
        
        for(int i=0;i<A.length-1;i++){
            int min=A[i][k];
            int vt=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j][k]<min){
                    min=A[j][k];
                    vt=j;
                }
            }
            if(vt!=i){
                int temp=A[i][k];
                A[i][k]=A[vt][k];
                A[vt][k]=temp;
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }          
    }
    
    public static void Bai3() {
        String A[][]={{"aaa aaaa aa","bbbbb bbb bbbbb b","c ccc cccc ccccc"},{"c ccc cccc ccccc","aaa aaaaa aaaaa","b bb bbb b"},{"b bb bbb b","c ccccc cccc ccccc c","aaa aaaa aa"}};
        int k=1;
        int max=A[0][k].length();
        int C[]=new int[A.length];
        int sl=1;
        for(int i=1;i<A.length;i++){
            if(A[i][k].length()>max){
                max=A[i][k].length();
                C[0]=i;
                sl=1;
            }else if(A[i][k].length()==max){
                C[sl]=i;
                sl++;
            }
        }
        System.out.print(C[0]);
        for(int i=1;i<sl;i++){
            System.out.print(","+C[i]);
        }
        System.out.println("");
        String B[]=new String[A.length*max];
        int msl=0;
        int maxl=0;
        for(int i=0;i<A.length;i++){
            StringTokenizer stk = new StringTokenizer(A[i][k]);
            int count = stk.countTokens();
            for(int j=0;j<count;j++){
                String a=stk.nextToken();
                if(a.length()>maxl){
                    msl=0;
                    B[msl]=a;  
                    maxl=a.length();
                }else if(a.length()==maxl){
                    msl++;
                    B[msl]=a;
                }
            }
        }
        for(int i=0;i<=msl;i++){
            System.out.println(B[i]);
        }    
    }
    
    public static void main(String[] args) {
        Bai1();
        System.out.println("----------");
        Bai2(); 
        System.out.println("-----------");
        Bai3();
    }
  
}
