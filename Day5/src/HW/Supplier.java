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
public class Supplier implements Comparable<Supplier>{
    String IdSup;// mã nhà cung cấp
    String Name;
    String  Address;
    String  Tel;

    public Supplier(String IdSup, String Name, String Address, String Tel) {
        this.IdSup = IdSup;
        this.Name = Name;
        this.Address = Address;
        this.Tel = Tel;
    }

    @Override
    public String toString() {
        return "Supplier{" + "IdSup=" + IdSup + ", Name=" + Name + ", Address=" + Address + ", Tel=" + Tel + '}';
    }

    @Override
    public int compareTo(Supplier o) {
        return this.Name.compareTo(o.Name);
    }
    @Override
    public int hashCode(){
        int hash = (int) (IdSup.charAt(0));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
         Supplier a = (Supplier) obj;
         return  Name.equals(a.Name);
    }
    
 
}
