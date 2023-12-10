package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class largestelement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("The array is:");
        System.out.println(Arrays.toString(arr1));

        System.out.println("find the largest element in array");
        int large=arr1[0];
        for(int i =0;i<n-1;i++)
        {
            if(arr1[i] > large)
            {
                large=arr1[i];
                i++;
            }


        }
        System.out.println("largest value is :"+large);
    }
}
