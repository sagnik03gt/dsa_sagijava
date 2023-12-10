package Binary_search;
import java.util.Scanner;
public class binaryserach {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=10;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int low=arr[0];
        int high=arr[n-1];
//        System.out.println(arr.toString());
        int ans = binary_rec(arr,low,high,25);
        System.out.println(ans);

    }
    public static int binary_search(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target > arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static int binary_rec(int[] arr,int low,int high,int target){
        if(low>=high)
        {
            return -1;
        }
        int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid] > target){
            return binary_rec(arr,low,mid-1,target);
        }
        else{
            return binary_rec(arr,mid+1,high,target);
        }
    }
}
