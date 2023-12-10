package arrays;
import java.lang.Math;
import java.util.*;
public class max_cinsecutive_ones {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int maxi=0;
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==1)
            {
                count++;
                maxi=Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        System.out.println("highest number of repeatation: "+maxi);

    }
}
