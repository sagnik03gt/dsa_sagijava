package Binary_search;

public class minimum_in_rotatedsortedarray_dup2 {

    public static int findmin(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (arr[low] <= arr[high]) {
                min = Math.min(arr[low], min);
                break;
            }
            if (arr[low] <= arr[mid]) {
                min = Math.min(arr[low], min);
                low = mid + 1;
            } else {
                min = Math.min(arr[mid], min);
                high = mid + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 3, 3, 3};
        int n = arr.length;
        int ans = findmin(arr, n);
        System.out.println("the minimum is: " + ans);
    }
}
