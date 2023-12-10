package Binary_search;

public class rose_bouquets_bs {

    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

    public static int bsroseGarden(int[] arr,int m,int k){

        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = bsroseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}

