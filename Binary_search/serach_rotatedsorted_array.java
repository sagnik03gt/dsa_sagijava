package Binary_search;

public class serach_rotatedsorted_array {

    public static int serch_rotsortarr(int[] arr,int n,int x){

        int low =0;
        int high=n-1;
        while(low<=high){

            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= x && x <= arr[mid]){
                    high=mid+1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid] <= x && x<=arr[high]){
                    low=mid-1;
                }
                else{
                    high=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int n = 8, x = 8;
        int ans=serch_rotsortarr(arr,n,x);
        System.out.println("the index is: "+ans);
    }
}
