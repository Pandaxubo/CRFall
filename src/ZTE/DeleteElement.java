package ZTE;

import java.util.Scanner;

/**
 * @author pandaxubo
 */
public class DeleteElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int t = in.nextInt();
            for(int i = 1;i<=t;i++){
                int n = in.nextInt();
                int[] a = new int[n+1];
                for(int j = 1;j<=n;j++){
                    a[j] = in.nextInt();
                }
                int res= find(a,n);
                System.out.println(n - res);
            }
        }
    }

    private static int find(int[] a,int n){
        int[] dp = new int[n+1];
        int res=  0;
        for(int i =1;i<a.length;i++){
            dp[i] = 1;
            for(int j = 1;j<i;j++){
                if(a[i]>a[j] && dp[j]+1>dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
