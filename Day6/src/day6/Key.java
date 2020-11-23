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
public class Key implements Comparable<Key>{
    Integer Id;

    public Key(Integer Id) {
        this.Id = Id;
    }


    @Override
    public int hashCode() {
        return Id%10;
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
        final Key other = (Key) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Key o) {
        return this.Id.compareTo(o.Id);
    }



    
    
    
}
