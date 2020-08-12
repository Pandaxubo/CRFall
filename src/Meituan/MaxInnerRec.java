package Meituan;
import java.util.*;
/**
 * @author pandaxubo
 *
 * @description 题目描述
 * 有一个直方图，用一个整数数组表示，其中每列的宽度为1，求所给直方图包含的最大矩形面积。比如，对于直方图[2,7,9,4],它所包含的最大矩形的面积为14(即[7,9]包涵的7x2的矩形)。
 *
 * 给定一个直方图A及它的总宽度n，请返回最大矩形面积。保证直方图宽度小于等于500。保证结果在int范围内。
 *
 * 测试样例：
 * [2,7,9,4,1],5
 * 返回：14
 */

public class MaxInnerRec {
    private static int countArea(int[] A, int n) {
        int res = 0;
        int width = 1;
        int cur = 0;
        int left;
        int right;
        while(cur <n){
            left = cur == 0 ? -1 : cur-1;
            right = cur == n-1 ? n : cur+1;
            while(left >= 0 && A[left] >= A[cur]){
                width++;
                left--;
            }
            while(right <= n-1 && A[right] >= A[cur]){
                width++;
                right++;
            }
            res = Math.max(res,A[cur] * width);
            cur++;
            width = 1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int q = 0;q <n;q++){
            arr[q] = in.nextInt();
        }
        System.out.println(countArea(arr,n));
    }
}