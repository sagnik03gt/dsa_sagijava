package Binary_search;

public class kth_missing_number {

    public static int brute(int[] arr,int n,int k){

        for(int i=0;i<n;i++){
            if(arr[i]<=k)
            {
                k+=1;
            }
            else{
                break;
            }
        }
        return k;
    }

    //bs

    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = brute(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
