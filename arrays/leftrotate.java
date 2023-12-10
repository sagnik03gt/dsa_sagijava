package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class leftrotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];
//        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int i;
        int temp=arr[0];
        for(i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
//            i++;
//            System.out.println(Arrays.toString(arr));
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
