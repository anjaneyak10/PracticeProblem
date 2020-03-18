package com.practice;

import java.util.Scanner;

public class IOUtil {
    public static int getInputNumber(){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int y=scanner.nextInt();
        scanner.close();
        return y;
    }

    public static int[] getInputArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int l = scanner.nextInt();
        int[] ar = new int[l];
        System.out.println("Enter the array");
        for (int i = 0; i < l; i++) {
            ar[i] = scanner.nextInt();
        }
        //scanner.close();
        return ar;
    }
}
