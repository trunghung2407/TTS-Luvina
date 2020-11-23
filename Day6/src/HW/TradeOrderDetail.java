/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.Random;

/**
 *
 * @author X1 GEN 4
 */
public class TradeOrderDetail {
    Integer OrderID;  
    Integer Amount;
    Float Price;

    public TradeOrderDetail(Integer OrderID) {
        Random generator = new Random();
        this.OrderID = OrderID;
        this.Amount = generator.nextInt(5)+1;
        this.Price = (float)(generator.nextInt(10)+10);
    }

    @Override
    public String toString() {
        return "TradeOrderDetail{" + "Price=" + Price + '}';
    }
    

    
    
}
