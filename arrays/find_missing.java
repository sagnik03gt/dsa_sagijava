package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class find_missing {
    public static void main(String[] args) {

        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
        int ans2 = brutemissingNumber(a, N);
        System.out.println("The missing number is: " + ans2);
        int ans3 = missingNumberopt(a, N);
        System.out.println("The missing number is: " + ans3);


    }
    //optimal approach
    public static int missingNumberopt(int []a, int N) {
        int sum=N*(N+1)/2;
        int s2=0;
        for(int i=0;i<N;i++)
        {
            s2+=a[i];
        }
        int miss=sum-s2;
        return miss;
    }

    //better approach
    public static int missingNumber(int []a, int N) {

        int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
    //brute
    public static int brutemissingNumber(int []a, int N) {

        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
}
