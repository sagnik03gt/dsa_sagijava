package arrays;

import java.util.*;

public class stock_sell_buy {

    static long maxprofit(int a[],int n)
    {
        n=a.length;
        long mini=a[0];
        long profit=0;
        long cost=0;
        for(int i=1;i<n;i++)
        {
            cost=a[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,a[i]);
        }
//        System.out.println(mini);
//        System.out.println(cost);
        return profit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        long ans = maxprofit(a,n);
        System.out.println("maximum profit will be: "+ans);
    }
}
