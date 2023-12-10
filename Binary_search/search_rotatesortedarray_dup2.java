package Binary_search;

public class search_rotatesortedarray_dup2 {
    public static boolean serch_rotsortarrdup(int[] arr,int n,int x) {

        int low = 0;
        int high = n - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            //if mid points the target
            if (arr[mid] == x) return true;

            //Edge case:
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= x && x <= arr[mid]) {
                    //element exists:
                    high = mid - 1;
                } else {
                    //element does not exist:
                    low = mid + 1;
                }
            } else { //if right part is sorted:
                if (arr[mid] <= x && x <= arr[high]) {
                    //element exists:
                    low = mid + 1;
                } else {
                    //element does not exist:
                    high = mid - 1;
                }
            }
        }
        return false;
      }

    public static void main(String[] args) {
        int[] arr = {3,1,2,3,3,3,3};
        int n = 7, x = 3;
        boolean ans=serch_rotsortarrdup(arr,n,x);
        System.out.println("the index is: "+ans);
    }
}
