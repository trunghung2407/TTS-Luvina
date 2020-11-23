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
public class OrderDetail {
    int  IdOrder; // mã hoá đơn
    int IdDetail;// mã hoá đơn chi tiết
    int ItemID;// mã hàng
    int Amount;// số lượng hàng
    float Price; //đơn giá
    
    public OrderDetail(int IdOrder, int IdDetail, int ItemID, int Amount, float Price) {
        this.IdOrder = IdOrder;
        this.IdDetail = IdDetail;
        this.ItemID = ItemID;
        this.Amount = Amount;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "--IdOrder: "+IdOrder+";IdDetail: "+IdDetail+";ItemID: "+ItemID+";Amount: "+Amount+";Price: "+Price;
    }
    
    
    
    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int IdOrder) {
        this.IdOrder = IdOrder;
    }

    public int getIdDetail() {
        return IdDetail;
    }

    public void setIdDetail(int IdDetail) {
        this.IdDetail = IdDetail;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
}
