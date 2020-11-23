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
public class Trader implements Comparable<Trader>{
    String TraderCode;
    String PIN;//Personal Identification Number
    String Address;
    String Email;
    String Tel;

    public Trader(String TraderCode, String PIN, String Address, String Email, String Tel) {
        this.TraderCode = TraderCode;
        this.PIN = PIN;
        this.Address = Address;
        this.Email = Email;
        this.Tel = Tel;
    }
    @Override
    public int compareTo(Trader o) {
        return PIN.compareTo(PIN);
    }
}
