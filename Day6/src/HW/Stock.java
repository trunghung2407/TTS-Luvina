/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.Objects;

/**
 *
 * @author X1 GEN 4
 */
public class Stock {
    String StockCode;
    String Info;////Thông tin về Cty   

    @Override
    public int hashCode() {
        int hash = (int)(this.StockCode.charAt(0)+this.StockCode.charAt(1));
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
        final Stock other = (Stock) obj;
        if (!Objects.equals(Info, other.Info)) {
            return false;
        }
        return true;
    }

    public Stock(String StockCode, String Info) {
        this.StockCode = StockCode;
        Info = Info;
    }
}
