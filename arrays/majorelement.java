package arrays;
import java.util.*;
public class majorelement {
        public static int majorityElement(int []v) {
            //size of the given array:
            int n = v.length;

            //declaring a map:
            HashMap<Integer, Integer> mpp = new HashMap<>();

            //storing the elements with its occurnce:
            for (int i = 0; i < n; i++) {
                int value = mpp.getOrDefault(v[i], 0);
                mpp.put(v[i], value + 1);
            }

            //searching for the majority element:
            for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
                if (it.getValue() > (n / 2)) {
                    return it.getKey();
                }
            }

            return -1;
        }
        //optimal
    public static int majorityElementopt(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

        public static void main(String args[]) {
            int[] arr = {2, 2, 1, 1, 1, 2, 2};
            int ans = majorityElement(arr);
            int ans2= majorityElementopt(arr);
            System.out.println("The majority element is: " + ans);
            System.out.println("The majority element is: " + ans2);


        }

    }


