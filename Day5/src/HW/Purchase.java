/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.Date;

/**
 *
 * @author X1 GEN 4
 */
public class Purchase implements Comparable<Purchase>{
    int IdPurchase;// mã đơn nhập hàng
    String purDate;// ngày nhập hàng
    String SupplierID ;// mã nhà cung cấp

    @Override
    public String toString() {
        return "Purchase{" + "IdPurchase=" + IdPurchase + ", purDate=" + purDate + ", SupplierID=" + SupplierID + '}';
    }

    public Purchase(int IdPurchase, String purDate, String SupplierID) {
        this.IdPurchase = IdPurchase;
        this.purDate = purDate;
        this.SupplierID = SupplierID;
    }

    @Override
    public int compareTo(Purchase o) {
        return IdPurchase+"".compareTo(o.IdPurchase+"");
    }
}
