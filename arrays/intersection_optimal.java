package arrays;

import java.util.*;
public class intersection_optimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        Set<Integer> inter = new HashSet<Integer>();

        int i=0;
        int j=0;
        while(i<n && j<n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                inter.add(arr2[j]);
                i++;
                j++;
            }
        }
        System.out.println(inter);

    }
}
