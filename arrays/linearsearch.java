package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class linearsearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter your key element: ");
        int key=input.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("the element is at"+i+"th index");
                break;
            }
        }


    }
}
