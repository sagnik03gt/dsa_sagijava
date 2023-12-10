package Binary_search;

public class firstandlast_occurance {
    public static int lb(int[] arr,int target,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

    public static int ub(int[] arr,int target,int n){
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
    public static int[] firstandlastocc(int[] arr,int x,int n){
        int first=lb(arr,x,n);
        int last=ub(arr,x,n)-1;

        if((first == n) || (first != x))
        {
            return new int[]{-1, -1};
        }
        else{
            return new int[]{first,last};
        }
    }
//using binary search
    public static int last(int n, int key, int[] v) {
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
            int mid = start+end / 2;
            if (v[mid] == key) {
                res = mid;
                start = mid + 1;

            } else if (key < v[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
    public static int first(int n, int key, int[] v) {
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
            int mid = start+end / 2;
            if (v[mid] == key) {
                res = mid;
                end = mid - 1;

            } else if (key < v[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 4, 8, 10};
        int n = 6, x = 4;
        int first = first(n,x,arr);
        int last = last(n,x,arr);
//        int[] ans = firstandlastocc(arr, x, n);
        System.out.println("The first and last occurance is : " + first
                + " " + last);

    }

}
