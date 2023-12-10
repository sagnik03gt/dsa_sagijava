package arrays;
import java.util.*;
public class union_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter the size of the array2: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

//brute
//        Set<Integer> set = new HashSet<Integer>();
//        int[] union = new int[set.size()];
//        for(int i=0;i<n;i++)
//        {
//            set.add(arr1[i]);
//        }
//        for(int i=0;i<n2;i++)
//        {
//            set.add(arr2[i]);
//        }
//        System.out.println(set);
//        int i=0;
//        for(int it:set)
//        {
//            union[i]=it;
//            i++;
//        }
//        System.out.println(Arrays.toString(union));

//optimal
        int i=0;
        int j=0;
        ArrayList<Integer> Union = new ArrayList<>();

        while(i<n && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                if(Union.size()== 0 || Union.get(Union.size()-1) != arr1[i])
                {
                    Union.add(arr1[i]);
                    i++;
                }
            }
            else{
                if(Union.size()== 0 || Union.get(Union.size()-1) != arr2[j])
                {
                    Union.add(arr2[j]);
                    j++;
                }
            }

        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < n2) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        for( i=0;i<Union.size();i++)
        {
            Union.get(i);
        }
    }
}
