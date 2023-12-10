package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class removezero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

//        int[] temp = new int[n];
//        int a=0;
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]!=0)
//            {
//                temp[a]=arr[i];
//                a++;
//
//            }
//        }
//        for(int i=0;i< temp.length;i++)
//        {
//            arr[i]=temp[i];
//        }
//        int nz = temp.length;
//        for(int i=nz;i<n;i++)
//        {
//            arr[i]=0;
//        }
////        System.out.println(Arrays.toString(temp));
//        System.out.println(Arrays.toString(arr));

        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=arr[i];
                break;
            }
        }
        int temp1;
        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
