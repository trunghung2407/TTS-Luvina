/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author X1 GEN 4
 */
public class NguoiGuiTien implements Comparable<NguoiGuiTien>{
    String Ma;
    String Hoten;
    String Diachi;
    String Sodienthoai;
    String Ngaysinh;

    public NguoiGuiTien(String Ma, String Hoten, String Diachi, String Sodienthoai, String Ngaysinh) {
        this.Ma = Ma;
        this.Hoten = Hoten;
        this.Diachi = Diachi;
        this.Sodienthoai = Sodienthoai;
        this.Ngaysinh = Ngaysinh;
    }

    @Override
    public String toString() {
        return "NguoiGuiTien{" + "Ma=" + Ma + ", Hoten=" + Hoten + ", Diachi=" + Diachi + ", Sodienthoai=" + Sodienthoai + ", Ngaysinh=" + Ngaysinh + '}';
    }

    @Override
    public int compareTo(NguoiGuiTien o) {
        return Ma.compareTo(o.Ma);
    }
}
