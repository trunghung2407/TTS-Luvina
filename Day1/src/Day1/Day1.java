/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author X1 GEN 4
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    
    //1) Sắp xếp các số lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static void Cau1A(){
        int[] A={2,7,5,4,3,1};

        for(int i=0;i<A.length;i++){
            if(A[i]%2==1){
                int min = A[i];
                int vt=i;
                for(int j=i+1;j<A.length;j++){
                    if(A[j]%2==1&&A[j]<min){
                        min=A[j];
                        vt=j;
                    }
                }
                A[vt]=A[i];
                A[i]=min;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    
    //2) Sắp xếp các số dương tăng dần, các số âm giữ nguyên vị trí
    public static void Cau2A(){
        int[] A={-2,7,5,-4,3,1,-6};

        for(int i=0;i<A.length;i++){
            int vt=0;
            for(int k=A.length-1;k>=0;k--){
                if(A[k]>=0){
                    vt=k;
                    break;
                }
            }
            for(int j=vt-1;j>=i;j--){
                if(A[j]>=0){
                    if(A[j]>A[vt]){
                        int temp = A[j];
                        A[j]=A[vt];
                        A[vt]=temp;
                    }
                    vt=j;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
    
    //3) Sắp xếp các số dương tăng dần, các số âm giảm dần.   
    public static void Cau3A(){
        int[] A={-4,7,5,-6,3,-2,-9,1};

        for(int i=0;i<A.length;i++){
            int vtd=0,vta=0;
            for(int k=A.length-1;k>=0;k--){
                if(A[k]>=0){
                    vtd=k;
                    break;
                }
            }
            for(int k=A.length-1;k>=0;k--){
                if(A[k]<0){
                    vta=k;
                    break;
                }
            }
            for(int j=A.length-1;j>=i;j--){
                if(A[j]>=0){
                    if(A[j]>A[vtd]){
                        int temp = A[j];
                        A[j]=A[vtd];
                        A[vtd]=temp;
                    }
                    vtd=j;
                }
                if(A[j]<0){
                    if(A[j]<A[vta]){
                        int temp = A[j];
                        A[j]=A[vta];
                        A[vta]=temp;
                    }
                    vta=j;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
    
    
    //0) Chấm điểm Multiple-Choice Test
    public static void Cau0B(){
        String A[][]={{"A","B","C","D","A"},{"D","C","B","A","D"},{"A","B","C","D","B"},{"A","C","C","D","B"},{"D","B","B","D","A"}};
        String key[]={"A","B","C","D","A"};
        for(int i=0;i<A.length;i++){
            int score=0;
            for(int j=0;j<A[i].length;j++){
                if(A[i][j].equals(key[j])){
                    score ++;
                }
            }
            System.out.println("score student "+i+": "+score +";");
        }
                
    }
    
    //1) Tổng 2 ma trận 
    public static void Cau1B(){
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{10,11,12},{13,14,15},{16,17,18}};
        int C[][] =new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    //2) Tích 2 ma trận 
    public static void Cau2B(){
        int A[][]={{1,2},{3,4},{5,6},{7,8}};
        int B[][]={{9,10,11},{12,13,14}};
        int C[][] =new int[A.length][B[0].length];
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                C[i][j]=0;
                for(int k=0;k<B.length;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    //3) Định thức của ma trận
    public static void Cau3B(){
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int det=0;
        for(int i=0;i<A.length;i++){
            int k=i;
            int temp=1;
            for(int j=0;j<A.length;j++){
                temp*=A[j][k];
                k++;
                if(k>A.length-1){
                    k=0;
                }
            }
            det+=temp;
        }
        for(int i=0;i<A.length;i++){
            int k=i;
            int temp=-1;
            for(int j=0;j<A.length;j++){
                temp*=A[j][k];
                k--;
                if(k<0){
                    k=A.length-1;
                }   
            }
             det+=temp;
        }
        System.out.println(det);
    }
    
    //1) Cho một xâu kí tự chứa họ tên, có thể thừa một số dấu cách. Viết chương trình loại bỏ các dấu cách thừa.
    private static void Cau1C() {
        String name = "  Nguyen   Trung      Hung    ";
        name = name.trim();
        name = name.replaceAll("\\s+"," ");
        System.out.println(name);
        
    }
    
    //2) Cho một xâu kí tự họ tên. Viết chương trình tách riêng phần họ, đệm và tên.
    public static void Cau2C() {
        String name = "Nguyen Trung Van Hung";
        StringTokenizer stk = new StringTokenizer(name);
        String ho = "";
        String ten = "";
        String tendem="";
        int count = stk.countTokens();
        for(int i=0;i<count;i++){
            if(i==0){
                ho+=stk.nextToken();
            }else
            if(i==count-1){
                ten+=stk.nextToken();
                break;
            }else{
                tendem+=stk.nextToken();
                if(i!=count-2){
                    tendem+=" ";
                }
            }
 
        } 
        System.out.println("ho: "+ho);
        System.out.println("ten dem: "+tendem);
        System.out.println("ten: "+ten); 
    }
    
    //3) Cho xâu kí tự. Viết chương trình tìm tất cả các từ dài nhất trong xâu.
    public static void Cau3C(){
        String name = "Nguyen Trung Van Hungtyh";
        StringTokenizer stk = new StringTokenizer(name);
        int vt[] = new int[stk.countTokens()];
        int max =-1;
        String lengmax="";
        int count =0,sl=0;
        while(stk.hasMoreTokens()){
            String temp = stk.nextToken();
            if (temp.length()>max){
                lengmax=temp;
                sl=0;
                vt[sl]=count;
                max=temp.length();
            }else if(temp.length()==max){
                sl++;
                vt[sl]=count;
            }
            count++;
        }
        System.out.println("Dai nhat: "+lengmax);
        System.out.print("Vi tri: ");
        for(int i=0;i<sl;i++){
            System.out.print(vt[i]+", ");
        }
        System.out.println(vt[sl]+".");
    }
    
    
    //4) Cho một mảng chứa N phần tử là họ tên của sinh viên. Viết chương trình đếm xem có bao nhiêu sinh viên tên Bình.
    public static void Cau4C(){
        String[] name = {"Nguyen Trung Binh","Nguyen Van Binh", "Le Van Hoi", "Pham Yen Binh", "Do Van Bin"};
        int count =0;
        for(int i=0;i<name.length;i++){
            String rev = new StringBuffer(name[i]).reverse().toString();
            StringTokenizer stk = new StringTokenizer(rev);
            String lastname = new  StringBuffer(stk.nextToken()).reverse().toString();
            if(lastname.equals("Binh")){
                count++;
            }
        }
        System.out.println(count);
    }
    
    
    //5) Cho một mảng chứa N phần tử là họ tên của sinh viên. Hãy viết chương trình sắp xếp lại mảng theo thứ tự bảng chữ cái.
    public static void Cau5C(){
        String[] name = {"Nguyen Trung Binh","Nguyen Van Binh", "Le Van Hoi", "Pham Yen Binh", "Do Van Bin","Le Mai An"};
        String [][] Name = new String[name.length][2];
        int []vt = new int[name.length];
        for(int i=0;i<name.length;i++){
            vt[i]=i;
            Name[i][0]="";
            Name[i][1]="";
            StringTokenizer stk = new StringTokenizer(name[i]);
            int count = stk.countTokens();
            for(int j=0;j<count;j++){
                if(j==count-1){
                    Name[i][1]+=stk.nextToken();
                    break;
                }else{
                    Name[i][0]+=stk.nextToken();
                    if(j!=count-2){
                        Name[i][0]+=" ";
                    }
                }

            } 
        }
        for(int j=0;j<vt.length;j++){
            for(int i=0;i<vt.length-1;i++){
                if(Name[vt[i]][1].compareTo(Name[vt[i+1]][1])>0){
                    int temp=vt[i];
                    vt[i]=vt[i+1];
                    vt[i+1]=temp;
                }else if(Name[vt[i]][0].compareTo(Name[vt[i+1]][0])>0&&Name[vt[i]][1].compareTo(Name[vt[i+1]][1])==0){
                    int temp=vt[i];
                    vt[i]=vt[i+1];
                    vt[i+1]=temp;
                }
            }
        }
        for(int i=0;i<vt.length;i++){
            System.out.println(Name[vt[i]][0]+" | "+Name[vt[i]][1]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Cau1A();
    }


    
}
