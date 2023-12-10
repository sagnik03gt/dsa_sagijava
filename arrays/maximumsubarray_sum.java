package arrays;

import java.util.*;

public class maximumsubarray_sum {

    static long maxsumsubarray(int a[],int n)
    {
         n=a.length;
         long sum=0;
         long maxi=0;
         int start=0;
         int ansStart,ansEnd;
         for(int i=0;i<n;i++)
         {
             if(sum==0)
             {
                 start=i;
             }
             sum=sum+a[i];
             if(sum>maxi)
             {
                 maxi=sum;
                 ansStart=start;
                 ansEnd=i;
             }
             if(sum<0)
             {
                 sum=0;
             }
         }
         return maxi;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        long ans = maxsumsubarray(a,n);
        System.out.println("maxsum of the subarray is: "+ans);
    }
}
