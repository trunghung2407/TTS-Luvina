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
public class Tree {
    TreeNode root;

    public Tree() {
        root=null;
    }
    void insert(int value){
        if(root==null){
            root= new TreeNode(value);
        }else{
            root.insertValue(value);
        }
    }
    
    public void preorderTraversal(){
        preorder( root );
    }
    
    public void inorderTraversal(){
        inorder( root );
    }
    public void postorderTraversal(){
        postorder( root );
    }

    private void preorder(TreeNode node) {
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.leftNode);
        preorder(node.rightNode);
    }

    private void inorder(TreeNode node) {
        if(node==null){
            return;
        }
        inorder(node.leftNode);
        System.out.print(node.data+" ");
        inorder(node.rightNode);
    }

    private void postorder(TreeNode node) {
        if(node==null){
            return;
        }
        postorder(node.leftNode);
        postorder(node.rightNode);
        System.out.print(node.data+" ");
    }
    
    public void insertw(int value){
        if(root==null){
            root= new TreeNode(value);
        }else{
            TreeNode current = root;
            while (true) {                
                if(value>current.data){
                    if(current.rightNode==null){
                        current.rightNode = new TreeNode(value);
                        break;
                    }else{
                        current=current.rightNode;
                    }
                }else{
                    if(current.leftNode==null){
                        current.leftNode= new TreeNode(value);
                        break;
                    }else{
                        current=current.leftNode;
                    }
                }
            }
        }
    }
    

    public int timkiem(int value){
        int check=duyetcay(root,value);
        return check;
    }
    
    public int duyetcay(TreeNode node,int value){
        int check = 0;
        if(value<node.data){
            if(node.leftNode==null){
                return 0;
            }else{
                check=duyetcay(node.leftNode, value);
            }
        }
        if(value>node.data){
            if(node.rightNode==null){
                return 0;
            }else{
                check=duyetcay(node.rightNode, value);
            }
        }
        if(value==node.data){
            return 1;
        }
        return check;
    }
    
    public int timkiemw(int value){
        int check =0;
       TreeNode node=root;
        while (true) {            
            if(value>node.data){
                if(node.rightNode==null){
                    check=0;
                    break;
                }else{
                    node=node.rightNode;
                }
            }else if(value<node.data){
                if(node.leftNode==null){
                    check=0;
                    break;
                }else{
                    node=node.leftNode;
                }
            }else{
                check=1;
                break;
            }
        }
        return check;
    }
    
    public void deletee(int value){
        if(root.data==value){
            root=null;
            return;
        }
        TreeNode node=root;
        while (true) {
            if(node.data>value){
                if(node.leftNode==null){
                    return;
                }
                if(node.leftNode.data==value){
                   node.leftNode=null;
                   break;
                }else{
                    node=node.leftNode;
                }
            }else{
                if(node.rightNode==null){
                    return;
                }
                if(node.rightNode.data==value){
                   node.rightNode=null;
                    break;
                }else{
                    node=node.rightNode;
                }
            }
        }
    }
}
