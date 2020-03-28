package com.practice;
import static com.practice.Node.N;
import java.util.List;
import java.util.Stack;

public class BinaryTree{
    public static void findPlace(Node current,int y){
        if(current.getData()>=y){
            if(current.getLeft()==null){
                Node left=N(y);
                current.setLeft(left);
            }

            else
                findPlace(current.getLeft(),y);
        }
        else if(current.getData()<y){
            if(current.getRight()==null){
                Node right=N(y);
                current.setRight(right);
            }
            else
                findPlace(current.getRight(),y);
        }
    }
    public static void main(String args[]){
        //Node root = null;
        int[] ar = com.practice.IOUtil.getInputArray();
        Node root=N(ar[0]);
        //System.out.println(root.getData());
        for (int i=1; i<ar.length;i++){
                findPlace(root,ar[i]);
        }
        inorder(root);
        Stack<Node>st = new Stack<>();
        Node current= root;
        while(!st.isEmpty() || (current != null)){
                while (current != null) {
                    st.push(current);
                    current = current.getLeft();
                    //System.out.println(st.peek().getData());
                }
            current=st.pop();
            System.out.println(current.getData());
            current=current.getRight();

        }
    }
    public static void inorder(Node cur){

    }
}

