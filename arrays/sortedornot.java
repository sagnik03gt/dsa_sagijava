package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class sortedornot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("The array is:");
        System.out.println(Arrays.toString(arr1));

        for(int i=0;i<n;i++)
        {
            if(arr1[i]>=arr1[i-1])
            {


            }
            else {
                System.out.println("not sorted");
            }
        }
        System.out.println("sorted");
    }

}
