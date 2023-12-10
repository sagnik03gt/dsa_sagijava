package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class removeduplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("the number of unique values: "+(i+1));


    }
}
