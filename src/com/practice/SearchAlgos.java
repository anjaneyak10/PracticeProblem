package com.practice;

import java.util.Scanner;

public class SearchAlgos {
    public static void main(String[] args) {
        int[] ar = getInputArray();
        int y = getInputNumber();
        if(search(ar, y, "")){
            System.out.println("Found " + y + " in the array");
        }
    }

    public static int getInputNumber(){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] getInputArray(){
        Scanner scanner = new Scanner(System.in);
        int[] ar = new int[100];
        System.out.println("Enter the length of array");
        int l = scanner.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i < l; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        return ar;
    }

    public static int[] sort(int[] ar) {
        int temp;
        int l = ar.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }

    public static boolean search(int[] ar, int y, String how){
        if(how.equals("Binary")){
            return binarySearch(ar, y);
        }else{
            return bruteForceSearch(ar, y);
        }
    }

    public static boolean bruteForceSearch(int[] ar, int y){
        for(int i:ar){
            if(y == i)
                return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] ar, int y) {
        if (ar == null || ar.length == 0)
            return false;

        int f = 0;
        int l = ar.length;

        if(!isSorted(ar))
            ar = sort(ar);

        while (f < l) {
            int m = (f + l) / 2;
            if (ar[m] == y)
                return true;
            else if (ar[m] < y)
                f = m + 1;
            else
                l = m - 1;
        }
        return false;
    }

    public static boolean isSorted(int ar[]) {
//        boolean isAscending = ar[0] < ar[ar.length-1];
//        for (int i = 0; i < ar.length - 1; i++) {
//            if (isAscending && ar[i] < ar[i + 1]) {
//                continue;
//            }
//        }
        return false;
    }
}