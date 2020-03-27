package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.practice.Node.N;
import static java.util.Arrays.asList;


public class TreeSearch {
    public static void main(String args[]) {
        List<Node> children2 = new ArrayList<>();

        List<Node> children5 = new ArrayList<>();

        List<Node> children9 = new ArrayList<>();

        List<Node> children6 = asList(N(11, children9));
        List<Node> children4 = asList(N(70, children5), N(38, children6));
        List<Node> children11 = new ArrayList<>();
        List<Node> children10 = asList(N(81, children11));

        List<Node> children7 = asList(N(122, children10));
        List<Node> children8 = new ArrayList<>();

        List<Node> children3 = asList(N(19, children7), N(28, children8));
        List<Node> children1 = asList(N(4, children2), N(7, children3), N(9, children4));
        Node root = N(5, children1);
        //System.out.println(dfs(root,122));
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        System.out.println(bfs(q.peek(),122,q));

    }



    public static boolean dfs(Node root, int y) {
        List<Node> gc = root.getChildren();
        System.out.println(root.getData());
        if (root.getData() == y)
            return true;
        boolean found = false ;
        for(int i=0;i<gc.size();i++){
            found =dfs(gc.get(i),y);
            if(found)
                return true;
        }
        return found;
    }
    public static boolean bfs(Node root, int y, Queue<Node> q){
        q.remove();
        List<Node> gc = root.getChildren();
        boolean found = false ;
        if (root.getData() == y)
            return true;
        for(int i=0;i<gc.size();i++){
            System.out.println(gc.get(i).getData());
            q.add(gc.get(i));
            if(gc.get(i).getData()==y)
                return true;
        }
        while(!q.isEmpty()){
            found =bfs(q.peek(),y,q);
            if(found)
                return true;
        }
        return found;
    }

}



