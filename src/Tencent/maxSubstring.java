package Tencent;
import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description s最少可以有多少个回文子串
 *input:
 * ababa（s）
 * 4（总共几个查询，下面是区间）
 * 1 4（abab=aba+b）
 * 1 5
 * 1 2
 * 1 3
 * output:
 * 2
 * 1
 * 2
 * 1
 *
 */
public class maxSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s =in.next();
            int t = in.nextInt();
            int[][] arr = new int[t][2];
            int[] ans = new int[t];
            for(int i=0;i<t;i++){
                for(int j=0;j<2;j++){
                    arr[i][j] = in.nextInt();
                    System.out.println(arr[i][j]);
                }
            }


            for(int k =0;k<t;k++){
                ans[k] = 0;
                while(arr[k][0]>=0&& arr[k][1]< s.length()){
                    while(s.charAt(arr[k][0]) == s.charAt(arr[k][1])){
                        System.out.println(s.charAt(arr[k][0])+" "+s.charAt(arr[k][1]));
                        arr[k][0] = arr[k][0] - 1;
                        arr[k][1] = arr[k][1]+1;
                        ans[k] = ans[k]+1;
                    }
                }
                System.out.println(ans[k]);
            }

        }
    }

}
