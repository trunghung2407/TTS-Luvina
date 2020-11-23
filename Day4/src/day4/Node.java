/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author X1 GEN 4
 */
public class Node {
    int data;
    Node next;

    public Node(int value) {
        data=value;
        next=null;
    }

    public Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }
    
    
    
}
