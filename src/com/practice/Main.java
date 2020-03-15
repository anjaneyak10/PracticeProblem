package com.jetbrains;
import java.util.Scanner;
public class Main{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ar= new int[100];
        System.out.println("Enter the length of array");
        int l=input.nextInt();
        System.out.println("Enter the array");

        for (int i=0;i<l;i++)
        {
            ar[i]=input.nextInt();

        }
        Main ob = new Main();
        ob.sort(ar,l);
        System.out.println("Enter a number you want to find");
        int y=input.nextInt();
        Main op = new Main();
        op.BinarySearch(ar,l,y);



    }
    public void sort(int ar[],int l)
    {
        int temp;
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
    }
    public void BinarySearch(int ar[],int l , int y)
    {
        int f= 0;

        int m;
        int found=0;
        while(f<l)
        {
            m=(f+l)/2;
            System.out.println(f +","+l);
            if(ar[m]<y)
            {
                f=m+1;
            }
            if(ar[m]>y)
            {
                l=m-1;
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