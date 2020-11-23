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
public class DanhSach {
    Node fist;
    Node last;

    public DanhSach() {
        last=fist=null;
    }
    
    public boolean isEmpty(){
        return(fist==null);
    }
    
    public void insertAtFront(int insertItem){
        if (isEmpty()) {
            fist=last=new  Node(insertItem);
        }else{
            fist=new Node(insertItem,fist);
        }
    }
    
    public void insertAtBack(int insertItem){
        if(isEmpty()){
            fist=last=new Node(insertItem);
        }else{
            last=last.next=new Node(insertItem);
        }
    }
    
    public int removeFront(){
        int remove =-1;
        if(!isEmpty()){
            remove=fist.data;
            fist=fist.next;  
        }
        return remove;
    }
    
    public int removeBack(){
        int remove=-1;
        if(!isEmpty()){
            remove=last.data;
            Node current = fist;
            while(current.next!=last){
                current=current.next;
            } 
                last=current;
                last.next=null;
            
        }
        return remove;
    }
    
    public void print(){
        Node current =fist;
        while (current!=null) {            
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("");
    }
    
    public void insertmiddle(int insert){
        Node current = fist;
        boolean check=false;
        if(isEmpty()){
            insertAtBack(insert);
        }else if(insert<fist.data){
            insertAtFront(insert);
        }else if(insert>last.data){
            insertAtBack(insert);
        }else{
            while(current.next.data<insert){
                current=current.next;
            }
            Node newnode = new Node(insert);
            newnode.next=current.next;
            current.next=newnode;
        }
        
    }
    
}
