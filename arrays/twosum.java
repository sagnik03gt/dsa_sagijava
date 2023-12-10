package arrays;
import java.util.*;
public class twosum {
    //better
        public static String twoSum(int n, int []arr, int target) {
            HashMap<Integer, Integer> mpp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = arr[i];
                int moreNeeded = target - num;
                if (mpp.containsKey(moreNeeded)) {
                    return "YES";
                }

                mpp.put(arr[i], i);//key=element,value=index
            }
            return "NO";
        }
        //brute
    public static String twoSum2(int n, int []arr, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }
    //optimal
    public static String twoSum3(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }


        public static void main(String args[]) {
            int n = 5;
            int[] arr = {2, 6, 5, 8, 11,14,12};
            int target = 14;
            String ans = twoSum(n, arr, target);
            System.out.println("This is the answer for variant 1: " + ans);
        }

    }

