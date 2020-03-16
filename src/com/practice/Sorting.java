package com.practice;

public class Sorting {
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

    public static boolean isSorted(int ar[]) {
        boolean isAscending = ar[0] < ar[ar.length-1];
        for (int i = 0; i < ar.length - 2; i++) {
            if (isAscending) {
                if (ar[i] < ar[i + 1]) {
                    continue;
                } else return false;
            }
            else {
                if (ar[i] > ar[i + 1]) {
                    continue;

                } else return false;
            }
       }
        return true;
    }
    public static int[] mergeSort(int ar[],int f,int l) {
        int [] temp= new int[l];
        while (f < l) {

            int m = f + l / 2;
            mergeSort(ar, f, m);
            mergeSort(ar, m + 1, l);
            temp =merge(f, m, l, ar);

        }
        return temp;
    }
    public static int[] merge (int f,int m ,int l ,int ar[]){


            int [] temp = new int[ar.length];
            int left=m-f+1;
            int right=l-m;
            int [] leftar =new int[left];
            int [] rightar= new int[right];
            for (int i =0;i<left;i++)
                leftar[i]=ar[f+i];
            for (int i =0;i<left;i++)
                leftar[i]=ar[m+1+i];
            int i=0;
            int j=0;
            int k=0;


            while(i<left&&j<right){


                if(leftar[i]<rightar[j])
                    temp[k++]=leftar[i++];
                else
                    temp[k++]=rightar[j++];
            }
            while(i<left)
                temp[k++]=leftar[i++];
            while(j<right)
                temp[k++]=rightar[j++];
            return temp;


    }
}
