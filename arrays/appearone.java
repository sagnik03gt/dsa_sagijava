package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class appearone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
//        for(int i=0;i<n;i++)
//        {
//            int num=arr1[i];
//            int count=0;
//            for(int j=0;j<n;j++)
//            {
//                if(arr1[j]==num)
//                {
//                    count++;
//                }
//            }
//            if(count==1)
//            {
//                System.out.println(num);
//            }
//        }
        //better
//        int maxi=arr1[0];
//        for(int i=0;i<n;i++)
//        {
//            maxi=Math.max(maxi,arr1[i]);
//        }
//        int Hash[] = new int[maxi+1];
//        for(int i=0;i<n;i++)
//        {
//            Hash[arr1[i]]++;
//        }
//        for(int i=0;i<n;i++)
//        {
//            if(Hash[arr1[i]]==1)
//            {
//                System.out.println(arr1[i]);
//            }
//        }

        //optimal
        //1^1=0 means i^i=0
        //here we will use this xor concept
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr1[i];
        }
        System.out.println(xor);
    }
}
