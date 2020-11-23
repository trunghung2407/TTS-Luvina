/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author X1 GEN 4
 */
public class TradeOrder{
    Integer OrderID; 
    String StockCode;
    String SellerID, BuyerID;
    String date= "10/10/2000";
    public TradeOrder(Integer OrderID, String StockCode, String SellerID, String BuyerID) {
        this.OrderID = OrderID;
        this.StockCode = StockCode;
        this.SellerID = SellerID;
        this.BuyerID = BuyerID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.OrderID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TradeOrder other = (TradeOrder) obj;
        if (!Objects.equals(this.StockCode, other.StockCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TradeOrder{" + "OrderID=" + OrderID + ", StockCode=" + StockCode + ", SellerID=" + SellerID + ", BuyerID=" + BuyerID + ", date=" + date + '}';
    }
    
    
    

    
}
