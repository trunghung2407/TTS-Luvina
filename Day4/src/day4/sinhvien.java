/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author X1 GEN 4
 */
public class sinhvien implements Comparable<sinhvien>{
        String Hoten;
        String NgaySinh;
        String Quequan;
        String Nganhhoc;
        double dtb;
        String TA;

    public sinhvien(String Hoten, String NgaySinh, String Quequan, String Nganhhoc, double dtb, String TA) {
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.Quequan = Quequan;
        this.Nganhhoc = Nganhhoc;
        this.dtb = dtb;
        this.TA = TA;
    }

    @Override
    public String toString() {
        return Hoten+" "+NgaySinh+" "+Quequan+" "+Nganhhoc;
    }

    @Override
    public int compareTo(sinhvien o) {
        return Hoten.compareTo(o.Hoten);
    }
        
}
