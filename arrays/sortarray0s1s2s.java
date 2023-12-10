package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortarray0s1s2s {
    static void sortbetter(int a[],int n)
    {
        n=a.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                cnt0++;
            }
            else if (a[i]==1) {
                cnt1++;
            } else
            {
                cnt2++;
            }
        }
//        System.out.println(cnt1+cnt1+cnt2);
        for(int i=0;i<cnt0;i++)
        {
            a[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++)
        {
            a[i]=1;
        }
        for(int i=cnt0+cnt1;i<n;i++)
        {
            a[i]=2;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(a));
        sortbetter(a,n);
    }
}
