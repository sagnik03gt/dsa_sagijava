package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr1 = new int[5];
//        arr1[0]=45;
//        arr1[1]=25;
//        arr1[2]=36;
//        arr1[3]=69;
//        arr1[4]=3;
//
//        System.out.println(Arrays.toString(arr1));
//
//        int[] arr2 = {7,85,9,54,78};
//
//        for(int num: arr2){
//            System.out.println(num+" ");
//        }
//        String[] str = new String[4];
//        for(int i =0;i<str.length;i++)
//        {
//            str[i]= input.next();
//
//        }
//        System.out.println(Arrays.toString(str));

        int[][] arr2d = new int[3][2];
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<2;col++)
            {
                arr2d[row][col]=input.nextInt();
            }
        }

        for(int row=0;row<3;row++)
        {
            for(int col=0;col<2;col++)
            {
                System.out.println(arr2d[row][col]+" ");
            }
            System.out.println();
        }
       // System.out.println(Arrays.toString(arr2d));

    }
}
