/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author X1 GEN 4
 */
public class Address {
    private String country;
    private String city;
    private String district;
    private String street;

    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", city=" + city + ", district=" + district + ", street=" + street + '}';
    }
    
            
}
