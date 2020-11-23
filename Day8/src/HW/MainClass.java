/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import static day8.ConnectToSQLServer.prepareStatementSelect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import java.sql.*;

/**
 *
 * @author X1 GEN 4
 */
public class MainClass {
    
    static TreeMap TMNGT = new TreeMap<NguoiGuiTien, Double>();
    
    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
         "databaseName=Day8;user=Username;password=Password";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// buoc 1
            con = DriverManager.getConnection(connectionUrl); // buoc 2
            String SQL = "Select* from NguoiGuiTien ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                NguoiGuiTien temp = new NguoiGuiTien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                double money=Double.parseDouble(rs.getString(6));
                System.out.println(temp.toString()+money);
                TMNGT.put(temp, money);
            }          
        } catch (Exception e) {
         e.printStackTrace();
        }
        NguoiGuiTien temp = new NguoiGuiTien("06", "H T J 6", "EveryWhere 6", "4933944383", "24/7/1989");
        int money=4000;
        if(TMNGT.get(temp)==null){
            String SQL = "Insert into NguoiGuiTien values('"+temp.Ma+"','"+temp.Hoten+"','"+temp.Diachi+"','"+temp.Sodienthoai+"','"+temp.Ngaysinh+"','"+money+"')";
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }else{
            TMNGT.get(temp).toString();
        }
        NguoiGuiTien temp1 = new NguoiGuiTien("01", "N V A 1", "EveryWhere 1", "0123456789", "20/3/2020");
        double money1=1000;
        if(TMNGT.get(temp1)!=null){
            double sum=money1+(double)TMNGT.get(temp1);
            System.out.println(TMNGT.get(temp1));
            System.out.println((int)sum);
            String SQL = "UPDATE NguoiGuiTien SET sotiengui = '"+(int)sum+"' WHERE Ma = "+temp1.Ma+";";
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(SQL);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }else{
            TMNGT.get(temp).toString();
        }
        System.out.println("================================");
        try{
        String SQL = "Select* from NguoiGuiTien ORDER BY sotiengui DESC";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                NguoiGuiTien temp2 = new NguoiGuiTien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                double money2=Double.parseDouble(rs.getString(6));
                System.out.println(temp2.toString()+money2);
            }       
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
