package Binary_search;

import java.util.Scanner;

public class upperbound {

    public static int findupperbound(int[] arr,int target,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=10;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int target=10;
        int ans = findupperbound(arr,target,n);
        System.out.println(ans);
    }
}
