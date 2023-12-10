package arrays;

import java.util.*;

public class intersection_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 5;
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int n2 = 6;
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        int[] visi = new int[n2];
        for (int i = 0; i < n2; i++) {
            visi[i] = 0;
        }
        System.out.println(Arrays.toString(visi));
        Set<Integer> inter = new  HashSet<Integer>();

        for(int i=0;i<n1;i++)
        {
            for( int j=0;j<n2;i++)
            {
                if (arr1[i]==arr2[j] && visi[j]==0){
                    inter.add(arr1[i]);
                    visi[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i])
                {
                    break;
                }
            }
        }
        System.out.println(inter);

    }
}
