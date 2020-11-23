/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BASE64EncoderStream;
import java.awt.List;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author X1 GEN 4
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    
    public static void Bai1(){
        int dong=0;
        int kitu=0;
        int sotu=1;
        BufferedReader br = null;
        try {
            String file =("D:\\Bai1.txt");
            //Đọc file
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine())!=null) {                
                dong++;
                line= line.trim();
                //Xử lý dòng và đếm 
                for(int i=0;i<line.length()-1;i++){
                    if(line.charAt(i)==32&&line.charAt(i+1)!=32){
                        sotu++;
                    }
                    if(line.charAt(i)!=32){
                        kitu++;
                    }
                }
            }
            System.out.println(dong+" dong");
            System.out.println(sotu+" tu");
            System.out.println(kitu+" kitu");
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            try {
                br.close();
            } catch (Exception e) {
            }
            
        }
    }
    
    public static void Bai2(){
        try {
            String fileN = "D:\\Bai2.txt";
            String fileD = "D:\\Bai2N.txt";
            BufferedReader br = new BufferedReader(new FileReader(fileN));
            String info="";
            String line;
            
            while ((line = br.readLine())!=null) {                
                info+=(line+"\n");
            }
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(fileD));
            byte[] a = info.getBytes();
            bo.write(a);
            bo.flush();
            
        } catch (Exception e) {
            System.out.println("Khong ton tai file");
        }
    }
    
    public static void Bai3(){
        //Khởi tạo user
        ArrayList<User> Users = new ArrayList<User>();
        String[] name = {"Nguyen Trung Binh","Nguyen Van Binh", "Le Van Hoi", "Pham Yen Binh", "Do Van Bin","Le Mai An"};
        for(int i=0;i<name.length;i++){
            User a = new User(name[i]);
            Users.add(a);
            
        }
        //OAll(Users);
        String file = "D://listuser.txt";
        LuuUser(Users, file);
        DocUser(file);
        System.out.println("Tong diem: "+SumScore(Users));
        
    }
    
    public static void LuuUser(ArrayList<User> Users,String file){
        ObjectOutputStream oos = null; 
        //Luu file
        try {
            oos= new ObjectOutputStream(new FileOutputStream(file));
            for (User u : Users) {  
                oos.writeObject(u);                
            }
        } catch (Exception e) {
            System.out.println(e+" |LuuUser");  
        }finally{
            try {
                oos.close();
            } catch (Exception e) {
            }            
        }
    }
    
    public static void DocUser(String file){
        ObjectInputStream ois =null;
        ArrayList<User> Users = new ArrayList<User>(); 
        try {
            //Đọc file
            ois = new ObjectInputStream(new FileInputStream(file));     
            while(ois.read()==-1){
                User temp=(User) ois.readObject();
                Users.add(temp);
                //System.out.println(temp);
            }
            
        } catch (Exception e) {
            System.out.println(e +" |DocUser");
        }
        //Tạo mảng luu tên
        String[] name=new String[Users.size()];
        for(int i=0;i<Users.size();i++){
            name[i] = Users.get(i).getUsername();
        }
        //Tạo mảng luu họ tên
        String [][] Name = new String[name.length][2];
        //Lưu vị trí sắp xếp tên
        int []vt = new int[name.length];
        //Chia họ và tên
        for(int i=0;i<name.length;i++){
            vt[i]=i;
            Name[i][0]="";
            Name[i][1]="";
            //Chia họ và tên
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
        //Sắp xếp tên
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
            System.out.println(Name[vt[i]][0]+" "+Name[vt[i]][1]);
        }    
    }
    
    public static double SumScore(ArrayList<User> Users){
        double sum =0;
        for (User u : Users) {
            sum+=u.getScore();
        }
        return sum;
    }
            
    public static void OAll(ArrayList<User> Users){
        BufferedOutputStream bo=null;
        String file = "D:\\danhsach.txt";
        try { 
            bo = new BufferedOutputStream(new FileOutputStream(file));
            String LUers="";
            for (User a : Users) {
                String b;
                b=("@"+a.getUsername()+"\n"+
                    +a.getAge()+"\n"+
                    a.getAddress()+"\n"+
                    a.getScore()+"\n");
                LUers+=b;
            }
            byte[] bds = LUers.getBytes();
            bo.write(bds);
            bo.flush();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                bo.close();
            } catch (Exception e) {
            }
        }
        String lname="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while ((line = br.readLine())!=null) {                
                if(line.charAt(0)==64){
                    lname+=line;
                }
            }
            
        } catch (Exception e) {
           
        }
        StringTokenizer stk0 = new StringTokenizer(lname,"@");
        int count0 = stk0.countTokens();
        String [] name= new String[count0];
        int temp0=-1;
        for(int i=0;i<lname.length();i++){ 
            if(lname.charAt(i)==64){
                temp0++;
                name[temp0]="";
            }else{
                name[temp0]+=lname.charAt(i);
            }
        }
        
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
            System.out.println(Name[vt[i]][0]+" "+Name[vt[i]][1]);
        }
        
        double sum=0;
        for (User i : Users) {
            double score=i.getScore();
            sum+=score;
        }
        System.out.println("Tong diem: "+sum);
           
    }
    
    public static void Bai4(){
        try {
            String fileN = "D:\\Bangdiem.txt";
            String fileD = "D:\\Bangdiem1.txt";
            //Đọc file
            BufferedReader br = new BufferedReader(new FileReader(fileN));
            String info="";
            String line;
            String lname="";
            while ((line = br.readLine())!=null) {                
                info+=(line+"\n");
                lname+=line+" ";
            }
            //Ghi file
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(fileD));
            byte[] a = info.getBytes();
            bo.write(a);
            bo.flush();
            //Chia các từ
            StringTokenizer stk = new StringTokenizer(lname);
            int count = stk.countTokens();
            String[] name = new String[stk.countTokens()];
            int mleng=0;
            int sl=0;
            //Tìm từ dài nhất
            for(int i=0;i<count;i++){
                String s= stk.nextToken();
                if(s.length()>mleng){
                    sl=0;
                    mleng=s.length();
                    name[sl]=s;
                    continue;
                }
                if(s.length()==mleng){
                    sl++;
                    name[sl]=s;
                }
                
            }
            //In kết quả
            System.out.println("so luong: "+(sl+1));
            for(int i=0;i<=sl;i++){
                System.out.println(name[i]);
            }
            
        } catch (Exception e) {
            System.out.println("Khong ton tai file");
        }
    }
    
    public static void Bai5(){
        String file = "D:\\matran.txt";
        DataInputStream dis = null;
        ArrayList<Double> list = new ArrayList<Double>();
        //Đọc file
        DataOutputStream dos = null;
        double a[][]={{10,3,7},{4,5,9},{8,4,6}};
        try {
            dos=new DataOutputStream(new FileOutputStream(file));
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    dos.writeDouble(a[i][j]);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            dis =new DataInputStream(new FileInputStream(file));
            while (true) {                
                try {
                    list.add(dis.readDouble());
                } catch (Exception e) {
                    break;
                }
 
            }
            //Xử lý mảng
            int sl = (int)Math.sqrt(list.size());
            if((sl*sl)==list.size()){
                double mt[][]= new double[sl][sl];
                int i=0,j=0;
                for (double integer : list) {
                    if(i==sl){
                        i=0;
                        j++;
                    }
                    mt[j][i]= integer;
                    i++;
                }
                //Tính định thức
                double kq=dinhthucduoiphuwhile(mt);
                System.out.println("Định thức của ma trận: "+kq);
            }
            
            
        } catch (Exception e) {
        }
    }
    
    public static double dinhthucduoichinh(double [][] a){
        int doihang=0;
        for(int i=0;i<a.length-1;i++){
            //Tìm phần tử khác không
            if(a[i][i]==0){
                boolean check=false;
                for(int j=i+1;j<a.length;j++){
                    //Đổi hàng
                    if(a[j][i]!=0){
                        for(int k=0;k<a.length;k++){
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                           
                        }
                        check=true;
                        doihang++;
                    }
                }
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            for(int j=i+1;j<a.length;j++){
                double temp= a[j][i]/a[i][i];
                for(int k=i+1;k<a.length;k++){
                    a[j][k]-=temp*a[i][k];
                }
            } 
        }
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        for(int i=0;i<a.length;i++){
            kq*=a[i][i];
        }
        return kq;
    }
    
    public static double dinhthucduoichinhwhile(double [][] a){
        int doihang=0;
        int i=0;
        while (i<a.length-1){
            //Tìm phần tử khác không
            if(a[i][i]==0){
                boolean check=false;
                int j=i+1;
                while (j<a.length) {                    
                    //Đổi hàng
                    if(a[j][i]!=0){
                        int k=0;
                        while (k<a.length) {  
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                            k++;
                        }
                        check=true;
                        doihang++;
                    }
                    j++;
                }
                
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            int j=i+1;
            while (j<a.length) { 
               double temp= a[j][i]/a[i][i];
               int k=i+1;
                while (k<a.length) {  
                    a[j][k]-=temp*a[i][k];
                    k++;
                }
               j++; 
            }
            i++;
        }
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        i=0;
        while (i<a.length) {
            kq*=a[i][i];            
            i++;
        }
        return kq;
    }

    
    public static double dinhthuctrenchinh(double [][] a){
        int doihang=0;
        for(int i=a.length-1;i>0;i--){
            //Tìm phần tử khác không
            if(a[i][i]==0){
                boolean check=false;
                for(int j=i-1;j>=0;j--){
                    //Đổi hàng
                    if(a[j][i]!=0){
                        for(int k=0;k<a.length;k++){
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                           
                        }
                        check=true;
                        doihang++;
                        break;
                    }
                }
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            for(int j=i-1;j>=0;j--){
                double temp= a[j][i]/a[i][i];
                for(int k=i-1;k>=0;k--){
                    a[j][k]-=temp*a[i][k];
                }
            }
        }
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        for(int i=0;i<a.length;i++){
            kq*=a[i][i];
        }
        return kq;
    }
    
    public static double dinhthuctrenchinhwhile(double [][] a){
        int doihang=0;
        int i=a.length-1;
        while (i>0) {  
            //Tìm phần tử khác không
            if(a[i][i]==0){
                boolean check=false;
                int j=i-1;
                while (j>=0) {                    
                     //Đổi hàng
                    if(a[j][i]!=0){
                        for(int k=0;k<a.length;k++){
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                           
                        }
                        check=true;
                        doihang++;
                        break;
                    }
                    j--;
                }
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            int j=i-1;
            while (j>=0) {                
                double temp= a[j][i]/a[i][i];
                int k=i-1;
                while (k>=0) {                    
                    a[j][k]-=temp*a[i][k];
                    k--;
                }
                j--;
            }
            i--;
        }

            
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        i=0;
        while (i<a.length) {       
             kq*=a[i][i];
            i++;
        }
        return kq;
    }
    
    public static double dinhthuctrenphu(double [][] a){
        int doihang=0;
        for(int i=a.length-1;i>0;i--){
            //Tìm phần tử khác không
            if(a[i][a.length-1-i]==0){
                boolean check=false;
                for(int j=i-1;j>=0;j--){
                    //Đổi hàng
                    if(a[j][i]!=0){
                        for(int k=0;k<a.length;k++){
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                            
                        }
                        check=true;
                        doihang++;
                        break;
                    }
                }
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            for(int j=i-1;j>=0;j--){
                double temp= a[j][a.length-1-i]/a[i][a.length-1-i];
                for(int k=a.length-1;k>=1;k--){
                    a[j][k]-=temp*a[i][k];
                }
            }
        }
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        for(int i=0;i<a.length;i++){
            kq*=a[i][a.length-1-i];
        }
        return kq;
    }
    
    public static double dinhthuctrenphuwhile(double [][] a){
        int doihang=0;
        int i=a.length-1;
        while (i>0) { 
            //Tìm phần tử khác không
            if(a[i][a.length-1-i]==0){
                boolean check=false;
                int j=i-1;
                while (j>=0) {  
                    //Đổi hàng
                    if(a[j][i]!=0){
                        for(int k=0;k<a.length;k++){
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                            
                        }
                        check=true;
                        doihang++;
                        break;
                    }
                    j--;
                }
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            int j=i-1;
            while (j>=0) {
                double temp= a[j][a.length-1-i]/a[i][a.length-1-i];
                int k=a.length-1;
                while(k>=1){
                    a[j][k]-=temp*a[i][k];
                    k--;
                }
                j--;
            }
            i--;
        }
        
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        i=0;
        while(i<a.length){
            kq*=a[i][a.length-1-i];
            i++;
        }
        return kq;
    }
    
    public static double dinhthucduoiphu(double [][] a){
        int doihang=0;
        System.out.println("");
        for(int i=0;i<a.length-1;i++){
            //Tìm phần tử khác không
            if(a[i][a.length-1-i]==0){
                boolean check=false;
                for(int j=i-1;j>=0;j--){
                    //Đổi hàng
                    if(a[j][i]!=0){
                        for(int k=0;k<a.length;k++){
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                            
                        }
                        check=true;
                        doihang++;
                        break;
                    }
                }
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            for(int j=i+1;j<a.length;j++){
                double temp= a[j][a.length-1-i]/a[i][a.length-1-i];
                for(int k=a.length-2;k>=0;k--){
                    a[j][k]-=temp*a[i][k];
                }
            }
        }
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        for(int i=0;i<a.length;i++){
            kq*=a[i][a.length-1-i];
        }
        return kq;
    }
    
    public static double dinhthucduoiphuwhile(double [][] a){
        int doihang=0;
        System.out.println("");
        int i=0;
        while (i<a.length-1) {   
            //Tìm phần tử khác không
            if(a[i][a.length-1-i]==0){
                boolean check=false;
                int j=i-1;
                while (j>=0) { 
                    //Đổi hàng
                    if(a[j][i]!=0){
                        int k=0;
                        while (k<a.length) {                            
                            double temp=a[i][k];
                            a[i][k]=a[j][k];
                            a[j][k]=temp;
                            k++;
                        }
                        check=true;
                        doihang++;
                        break;
                    }
                    j--;
                }    
                if(!check){
                    return 0;
                }
            }
            //Nhân hàng
            int j=i+1;
            while (j<a.length) {      
                double temp= a[j][a.length-1-i]/a[i][a.length-1-i];
                int k=a.length-2;
                while (k>=0) {
                    a[j][k]-=temp*a[i][k];
                    k--;
                }
                j++;
            }
           i++; 
        }
        double kq;
        if(doihang%2==0){
            kq=1;
        }else{
            kq=-1;
        }
        i=0;
        while (i<a.length) {
            kq*=a[i][a.length-1-i];            
            i++;
        }
        return kq;
    }
    
    
    public static void main(String[] args) {       
        Bai5();
    }
    
}
