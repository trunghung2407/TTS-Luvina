
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author X1 GEN 4
 */
public class NewClass {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void Bai1(){
        String s = sc.nextLine();
        System.out.println(s);
        int chu=0,so=0,kyhieu=0;
        for (int i=0; i<s.length();i++) {
            int cr =(int)s.charAt(i);
            if(cr!=32){
                if(cr>=65&&cr<90){
                    chu++;
                }else if(cr>=97&&cr<122){
                    chu++;
                }else if(cr>=48&&cr<=57){
                    so++;
                }else{
                    kyhieu++;
                }
            }   
        }
        System.out.println("chữ: "+chu);
        System.out.println("số: "+so);
        System.out.println("ký tự: "+kyhieu);
    }
    
    public static String Bai2(){
        String p = sc.nextLine();
        StringBuffer s=new StringBuffer("");
        String t="";
        while (!t.equals("q")) {            
            t=sc.next();
            s.append(t);
        }
        String h=""+s;
        File f = new File("D:\\"+p);
        try{
            OutputStream os = new FileOutputStream(f);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            osw.write(h);
            osw.flush();
            double lf = f.length();
            System.out.println(lf+" B");
        
        }catch(Exception e){
            System.out.println(e);
        }
        return p;
    }
    
    public static void Bai3(String p){
        File f = new File("D:\\"+p);
        try {
            InputStream is = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            String s="";
            while((line = br.readLine()) != null){
                s+=(line+"\n");
            }
            File nf = new File("D:\\ducnew.txt");
            OutputStream os = new FileOutputStream(nf);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            osw.write(s);
            osw.flush();
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        Bai1();
        String p =Bai2();
        Bai3(p);
    }
    
}
