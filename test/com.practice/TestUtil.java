package com.practice;

import java.util.Random;

public class TestUtil {


    public static int[] createRandomArray(int length) {
        Random rd = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }

    public static int getRandomInt(int max) {
        Random rd = new Random();
        return rd.nextInt(max);
    }

}
