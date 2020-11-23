/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author X1 GEN 4
 */
import java.util.Comparator;
import java.util.*;
import java.util.PriorityQueue;
/**
 *
 * @author ManhHung
 */
public class TestPriorityQueueBook {
    public static void main(String[] a) {
//         Queue<String> q= new LinkedList<String>();       
//            q.add("S1");
//            q.add("S2");
//            q.add("S3");
//            q.add("S4");
//            while (!q.isEmpty()) {
//                System.out.println("=="+ q.remove().toString());
//            }
        PriorityQueue<Book> pQ = new PriorityQueue<Book>();
        // Theo tac gia        
        pQ.add(new Book("Tutorial Java 1.1", "C1", 1990));
        pQ.add(new Book("Tutorial Java 1.2","A1", 1995));
        pQ.add(new Book("Tutorial C", "D1", 1985));
        pQ.add(new Book("Tutorial Pascal","A1",  1980));        
        // theo tac gia
        System.out.println(pQ.remove().toString());
        while (!pQ.isEmpty()) {
            System.out.println(pQ.remove().toString());
        } 
        // Theo nam
        PriorityQueue<Book> pQ1 = new PriorityQueue<Book> (new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getYear().compareTo(o2.getYear());
            }
        });
        pQ1.add(new Book("D Tutorial Java 1.1","C", 1990));
        pQ1.add(new Book("A Tutorial Java 1.2", "A", 1995));
        pQ1.add(new Book("C Tutorial C", "B", 1985));
        pQ1.add(new Book("B Tutorial Pascal","A", 1980));        
        pQ1.addAll(pQ);
        // Theo nam
        while (!pQ1.isEmpty()) {            
            System.out.println("=="+ pQ1.remove().toString());
        }
    }
}
