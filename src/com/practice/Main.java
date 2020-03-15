package com.practice;
import java.util.Scanner;
public class BinarySearch{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ar= new int[100];
        System.out.println("Enter the length of array");
        int l=input.nextInt();
        System.out.println("Enter the array");
        int temp;
        for (int i=0;i<l;i++)
        {
            ar[i]=input.nextInt();

        }
        for (int i=0;i<l-1;i++)
        {
            for (int j=i+1;j<l;j++)
            {
                if (ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]= ar[j];
                    ar[j]=temp;
                }

            }

        }

        int y  =1;
        int f= 0;

        int m;
        int found=0;
        while(f<l)
        {
            m=(f+l)/2;
            System.out.println(ar[m]);
            if(ar[m]<y)
            {
                f=m;
            }
            if(ar[m]>y)
            {
                l=m;
            }
            if(ar[m]==y)
            {
                System.out.println("Number found");
                found++;
                break;
            }
        }
        if(found==0)
            System.out.println("not found");

    }
}
