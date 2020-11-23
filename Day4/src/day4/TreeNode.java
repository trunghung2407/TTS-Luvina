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
public class TreeNode {
    int data;
    TreeNode leftNode,rightNode;
    public TreeNode(int value) {
        data=value;
        leftNode=rightNode=null;
    }
    public void insertValue(int value){
        if(value<data){
            if(leftNode==null){
                leftNode = new TreeNode(value);
            }else{
                leftNode.insertValue(value);
            }
        }else{
            if(rightNode==null){
                rightNode= new TreeNode(value);
            }else{
                rightNode.insertValue(value);
            }
        }
    }
    
}
