package com.practice;

public class LetItRip {
    public static void main(String[] args) {
        int[] ar = com.practice.IOUtil.getInputArray();
        int y = com.practice.IOUtil.getInputNumber();
        if(com.practice.SearchAlgos.search(ar, y, "")){
            System.out.println("Found " + y + " in the array");
        }
        else System.out.println(  y + " not in the array");
    }
}
