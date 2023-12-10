package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class second_largest {
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

        int large=arr1[0];
        int slarge=-1;

        for(int i=0;i<n;i++)
        {
            if(arr1[i]>large)
            {
                slarge=large;
                large=arr1[i];
            }
            else if(arr1[i]<large && arr1[i]>slarge)
            {
                slarge=arr1[i];
            }
        }
        System.out.println("second largest element is: "+slarge);

    }
}
