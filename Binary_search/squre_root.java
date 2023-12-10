package Binary_search;
import java.util.*;
public class squre_root {
    public static int floorSqrt(int n) {
        int ans = 0;
        // linear search on the answer space
        for (long i = 1; i <= n; i++) {
            long val = i * i;
            if (val <= (long) n) {
                ans = (int) i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static int findsqrt(int n){
        int low=1;
        int high=n;
        int ans=1;
        while(low<=high){
            long mid = (low+high)/2;
            if((mid*mid)<=n){
                ans=(int)mid;
                low= (int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
