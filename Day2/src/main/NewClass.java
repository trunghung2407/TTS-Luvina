/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author X1 GEN 4
 */
public class NewClass {
    
    public static void dinhthuc(){
        int A[][] = {{1,-3,0,2},{-2,5,3,-1},{2,-4,-1,5},{3,-7,4,2}};
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int temp=A[j][i]/A[i][i];
                for(int k=0;k<A[i].length;k++){
                    A[j][k]-=A[i][k]*temp;
                }
            }
            for(int u=0;u<A.length;u++){
                for(int v=0;v<A.length;v++){
                    System.out.print(A[u][v]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        dinhthuc();
    }
}
