package Tencent;
import java.util.Scanner;
public class newA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = in.nextInt();
            }
            System.out.println(find(arr,0,n-1,0));
        }
    }
    public static int find(int[] arr,int start,int end,int h){
        if(start == end){
            return 1;
        }
        int m =0;
        for(int i = start;i<=end;i++){
            m = Math.min(m,arr[i]);
        }
        int res = m - h;
        for(int i=start;i<=end;i++){
            if(arr[i] > m){
                int j = i;
                while(j < end && arr[j+1] > m) {
                    j++;
                }
                res += find(arr,i,j,m);
                i = j;
            }
        }
        return Math.min(res,end-start+1);
    }
}
