/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

import java.util.Objects;

/**
 *
 * @author X1 GEN 4
 */
public class Value {
    String Name;

    @Override
    public String toString() {
        return "Value{" + "Name=" + Name + '}';
    }

    public Value(String Name) {
        this.Name = Name;
    }

    
}
