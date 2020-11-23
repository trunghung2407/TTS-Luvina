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
public class PurchaseDetail {
    int IdPurchase;
    int IdDetail;
    int ItemID;
    int  Amount;
    float Price;

    @Override
    public String toString() {
        return "PurchaseDetail{" + "IdPurchase=" + IdPurchase + ", IdDetail=" + IdDetail + ", ItemID=" + ItemID + ", Amount=" + Amount + ", Price=" + Price + '}';
    }

    public PurchaseDetail(int IdPurchase, int IdDetail, int ItemID, int Amount, float Price) {
        this.IdPurchase = IdPurchase;
        this.IdDetail = IdDetail;
        this.ItemID = ItemID;
        this.Amount = Amount;
        this.Price = Price;
    }
}
