package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rightrotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("By how many places do u want to rotate: ");
        int d = input.nextInt();
        d = d % n;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        reverse(arr,n-d,n-1);
        reverse(arr,0,d);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int arr[],int start,int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
