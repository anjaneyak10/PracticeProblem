package com.practice;

public class SearchAlgos {

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

        if(!com.practice.Sorting.isSorted(ar))
            ar = com.practice.Sorting.mergeSort(ar,0,l);

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

}