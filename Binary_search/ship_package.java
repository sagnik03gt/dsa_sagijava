package Binary_search;

public class ship_package {

    public static int daystaken(int[] weight,int cap){
        int days=1,load=0;
        int n=weight.length;
        for(int i=0;i<n;i++){
            if((load+=weight[i])>cap){
                days=days+1;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }
        return days;
    }
    public static int least_cap(int[] weight,int n,int days){

        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < n; i++) {
            high += weight[i];
            low = Math.max(low, weight[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(daystaken(weight,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int n=weights.length;
        int d = 5;
        int ans = least_cap(weights,n,d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
