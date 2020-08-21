package SenseTime;

import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description 最长上升路径
 */
public class LongestUpList {
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
            System.out.println(longestPath(tar));
        }
    }

    public static int longestPath(int[][] tar) {
        if (tar.length == 0) {
            return 0;
        }
        int[][] res = new int[tar.length][tar[0].length];
        int max = 0;
        for (int i = 0; i < tar.length; i++) {
            for (int j = 0; j < tar[0].length; j++) {
                max = Math.max(plus(res, i, j, tar), max);
            }
        }
        return max;
    }

    private static int plus(int[][] res, int x, int y, int[][] tar) {
        int max = 0;
        if (res[x][y] == 0) {
            if (x > 0 && tar[x][y] < tar[x - 1][y]) {
                max = Math.max(max, plus(res, x - 1, y, tar));
            }
            if (y > 0 && tar[x][y] < tar[x][y - 1]) {
                max = Math.max(max, plus(res, x, y - 1, tar));
            }
            if (x < tar.length - 1 && tar[x][y] < tar[x + 1][y]) {
                max = Math.max(max, plus(res, x + 1, y, tar));
            }
            if (y < tar[0].length - 1 && tar[x][y] < tar[x][y + 1]) {
                max = Math.max(max, plus(res, x, y + 1, tar));
            }
            res[x][y] = max + 1;
        }
        return res[x][y];
    }
}
