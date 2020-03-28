package com.practice;

import java.util.ArrayList;
import java.util.List;

class Node{
    private List<Node> children;
    private Node left;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private Node right;
    private int data;
    private Node(int d, List<Node> children) {
        this.data = d;
        this.children = children;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    private Node(int d){
        this.data= d;
        this.left=null;
        this.right=null;
    }


    public List<Node> getChildren() {
        return children;
    }

    public int getData() {
        return data;
    }
    public static Node N(int d,List<Node> children){
        return new Node(d,children);
    }
    public static Node N(int d){
        return new Node(d);
    }


}