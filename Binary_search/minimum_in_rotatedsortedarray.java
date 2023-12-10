package Binary_search;

public class minimum_in_rotatedsortedarray {

    public static int findmin(int[] arr, int n){
        int low=0;
        int high=n-1;
        int ans =Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[low]<= arr[high]){
                ans=Math.min(ans,arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int n = arr.length;
        int ans=findmin(arr,n);
        System.out.println("the minimum is: "+ans);
    }
}
