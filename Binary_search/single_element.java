package Binary_search;




import java.util.*;

public class single_element {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of the array.
        if (n == 1)
            return arr.get(0);

        for (int i = 0; i < n; i++) {
            // Check for first index:
            if (i == 0) {
                if (!arr.get(i).equals(arr.get(i + 1))) //arr[0]!=arr[0+1] means arr[i] is the single element
                    return arr.get(i);
            }
            // Check for last index:
            else if (i == n - 1) {
                if (!arr.get(i).equals(arr.get(i - 1))) //arr[n-1]!=arr[n-2] means arr[n-1] is the single element
                    return arr.get(i);
            }
            else {
                if (!arr.get(i).equals(arr.get(i - 1)) && !arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
        }

        // Dummy return statement:
        return -1;
    }
    //optimal
    public static int singleNonDuplicateopt(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of the array.

        // Edge cases:
        if (n == 1)
            return arr.get(0);
        if (!arr.get(0).equals(arr.get(1)))
            return arr.get(0);
        if (!arr.get(n - 1).equals(arr.get(n - 2)))
            return arr.get(n - 1);

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the single element:
            if (!arr.get(mid).equals(arr.get(mid + 1)) && !arr.get(mid).equals(arr.get(mid - 1))) {
                return arr.get(mid);
            }

            // We are in the left:
            if ((mid % 2 == 1 && arr.get(mid).equals(arr.get(mid - 1)))
                    || (mid % 2 == 0 && arr.get(mid).equals(arr.get(mid + 1)))) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
        }

        // Dummy return statement:
        return -1;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
}

