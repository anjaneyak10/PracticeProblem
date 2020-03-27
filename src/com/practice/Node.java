package com.practice;

import java.util.ArrayList;
import java.util.List;

class Node{
    private List<Node> children;
    private int data;
    private Node(int d, List<Node> children) {
        this.data = d;
        this.children = children;
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


}