package arrays;

import java.util.*;

public class leader {
    public static ArrayList<Integer> leader1(int a[],int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        n=a.length;
        for(int i=0;i<n;i++)
        {
            boolean leader = true;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>a[i])
                {
                    leader=false;
                    break;
                }
            }
            if(leader == true)
            {
                ans.add(a[i]);
            }
        }
        return ans;
    }
    public static ArrayList<Integer>
    printLeadersoptimal(int[] arr, int n){

        ArrayList<Integer> ans= new ArrayList<>();

        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

        ans.add(arr[n-1]);

        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        return ans;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=input.nextInt();
        }
        ArrayList<Integer> ans= printLeadersoptimal(a,n);
//        ArrayList<Integer> ans = new ArrayList<>();
        ans =leader1(a,n);
        Collections.sort(ans, Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
