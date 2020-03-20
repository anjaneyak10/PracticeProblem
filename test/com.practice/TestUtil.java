package com.practice;

import java.util.Random;
import java.util.stream.IntStream;

public class TestUtil {


    public static int[] createRandomArray(int length) {
//        Random rd = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomInt(50);
        }
        return arr;
    }

    public static int getRandomInt(int max) {
        Random rd = new Random();
        return rd.nextInt(max);
    }


    public static int getRandomInt(int max,int[] not) {
        Random rd = new Random();
        int rnd = rd.nextInt(max);
        while(SearchAlgos.binarySearch(not,rnd)){
            return getRandomInt(max,not);
        }
        return rnd;
    }


    public static int[] sorted(int[] a){
        return IntStream.of(a).sorted().toArray();
    }

}
