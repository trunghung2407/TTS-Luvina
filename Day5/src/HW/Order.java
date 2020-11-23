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
public class Order implements Comparable<Order>{
    int  IdOrder;// mã hoá đơn
    String OrdDate;// ngày hoá đơn
    String CustomerID; // mã khách hàng

    public Order(int IdOrder, String OrdDate, String CustomerID) {
        this.IdOrder = IdOrder;
        this.OrdDate = OrdDate;
        this.CustomerID = CustomerID;
    }

    @Override
    public String toString() {
        return "IdOrder: "+IdOrder+";OrdDate: "+OrdDate+";CustomerID: "+CustomerID;
    }
    

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int IdOrder) {
        this.IdOrder = IdOrder;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }
    
    @Override
    public int compareTo(Order o) {
        return this.CustomerID.compareTo(o.CustomerID);
    }
    @Override
    public int hashCode(){
        int hash = (int) (CustomerID.charAt(4));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       Order a = (Order) obj;
       return CustomerID.equals(a.CustomerID);
    }
    
  
    
}
