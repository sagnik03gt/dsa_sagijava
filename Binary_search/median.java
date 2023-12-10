package Binary_search;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class median {
//
//    Integer[] arr1 = {2,4,6};
//    Integer[] arr2 = {1,3,5};
//
//    ArrayList<Integer> arraylist = new ArrayList<>();
//
//    List<Integer> list1 = Arrays.asList(arr1);
//    List<Integer> list2 = Arrays.asList(arr2);
//
//    arraylist.addAll()
//
//}
import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Collections;

public class median {

    public static double median(int[] a, int[] b) {
        // Size of two given arrays
        int n1 = a.length;
        int n2 = b.length;

        int n = n1 + n2; //total size
        //required indices:
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int ind1el = -1, ind2el = -1;

        //apply the merge step:
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (cnt == ind1) ind1el = a[i];
                if (cnt == ind2) ind2el = a[i];
                cnt++;
                i++;
            } else {
                if (cnt == ind1) ind1el = b[j];
                if (cnt == ind2) ind2el = b[j];
                cnt++;
                j++;
            }
        }

        //copy the left-out elements:
        while (i < n1) {
            if (cnt == ind1) ind1el = a[i];
            if (cnt == ind2) ind2el = a[i];
            cnt++;
            i++;
        }
        while (j < n2) {
            if (cnt == ind1) ind1el = b[j];
            if (cnt == ind2) ind2el = b[j];
            cnt++;
            j++;
        }

        //Find the median:
        if (n % 2 == 1) {
            return (double)ind2el;
        }

        return (double)((double)(ind1el + ind2el)) / 2.0;
    }

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Create an array
        Integer[] arr1 = {2,4,6};
        Integer[] arr2 = {1,3,5};

        // Convert the array to a List
        List<Integer> list1 = Arrays.asList(arr1);
    List<Integer> list2 = Arrays.asList(arr2);

        // Add the elements from the List (array) to the ArrayList
        arrayList.addAll(list1);
        arrayList.addAll(list2);

        // Print the ArrayList
        Collections.sort(arrayList);

        System.out.println(arrayList);

        int n = arrayList.size();
        if(n%2==0){
            float median = (arrayList.get(n/2)+arrayList.get(n/2)-1)/2;
            System.out.println(median);
        }
        else{
            System.out.println(arrayList.get(n/2));
        }
    }
}

