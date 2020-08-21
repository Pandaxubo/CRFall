package SenseTime;

import java.util.*;

/**
 * @author pandaxubo
 * @description 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 * 区间终点总是大于起点。【1，2】【2，3】 不重叠。
 * 输入：
 * [ [1,2], [2,3], [3,4], [1,3] ]
 * 输出：
 * 1
 * 移除【1，3】后剩下的区间不重叠。
 */
public class MinOverlapLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] tar = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    tar[i][j] = in.nextInt();
                }
            }
            //...
        }
    }
    /**
     *
     * @param intervals int整型二维数组
     * @return int整型
     */
        public static int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length == 0) {
                return 0;
            }
            if (intervals[0].length == 0) {
                return 0;
            }
            Arrays.sort(intervals, Comparator.comparingInt(t -> t[1]));//右边界排序
            int res = 0;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < intervals[i-1][1]) {//有重叠
                    intervals[i] = intervals[i-1];
                    res++;
                }
            }
            return res;
        }
}
