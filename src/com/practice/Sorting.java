package com.practice;

import java.sql.SQLOutput;

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
        if (ar.length > 1) {
            boolean isAscending = (ar[0] <= ar[(ar.length)-1]);
            for (int i = 0; i < ar.length - 1; i++) {
                if (isAscending) {
                    if (ar[i] > ar[i + 1]) {
                        return(false);
                    }
                }
                else {
                    if (ar[i] < ar[i + 1]) {
                        return(false);
                    }
                }
            }
        }
            return true;
    }
    public static int[] mergeSort (int ar[]) {

        if (ar.length<2)
            return ar;
        System.out.println();
        mergeSort(ar,0,ar.length-1);
        return ar;
    }
    private static void mergeSort(int ar[],int f,int l) {
        if(f < l) {

            int m = (f + l -1)/ 2;
            mergeSort(ar, f, m);
            mergeSort(ar, m + 1, l);
            merge(f, m, l, ar);


        }


    }
    private static void merge(int f,int m ,int l ,int ar[]){



            int left=m-f+1;
            int right=l-m;
            int [] leftar =new int[left];
            int [] rightar= new int[right];
            for (int i =0;i<left;i++)
                leftar[i]=ar[f+i];
            for (int i =0;i<right;i++)
                rightar[i]=ar[m+1+i];
            int i=0;
            int j=0;
            int k=f;


            while(i<left&&j<right){


                if(leftar[i]<rightar[j])
                    ar[k++]=leftar[i++];
                else
                    ar[k++]=rightar[j++];
            }
            while(i<left)
                ar[k++]=leftar[i++];
            while(j<right)
                ar[k++]=rightar[j++];
    }



    public static int[] quicksort(int []ar ) {
        if (ar.length<2)
            return ar;
        quicksort(ar,0,ar.length-1);
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);
        return ar;
    }

    private static void quicksort(int[]ar,int l,int r){
        int j;
        if(l<r) {
            j=partition(ar,l,r);
            quicksort(ar,l,j-1);
            quicksort(ar,j+1,r);
        }
    }


    private static int partition(int[]ar,int l ,int r) {
        int j=l;
        int i=l;
        for(int k=l+1;k<r;k++){
            if(ar[j]>=ar[k]){
                int temp = ar[j];
                ar[j]=ar[k];
                ar[k]=temp;
                j++;
            }
        }
        return j;
    }
}
