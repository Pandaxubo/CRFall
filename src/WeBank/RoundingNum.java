package WeBank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pandaxubo
 * @description 题目描述：
 * 给定一个长度为n的数组a，我们定义一个数x的近似值是在数组a中与x的差值的绝对值最小，如果两个数的绝对值相等，就取较小的那个。比如说对于[2, 5, 7]，4的近似值就是5，而6的近似值应该取5，因为5更小。
 *
 * 现在有q个询问，对每个询问回答近似值。
 *
 *
 *
 * 输入描述
 * 第一行两个整数n, q分别表示数组的长度和查询的次数。(1≤n，q≤1e5)
 *
 * 第二行n个数分别表示a1, a2, a3, … an。(0≤ai≤1e8)
 *
 * 接下来q行每行一个数x表示需要查询的数。(0≤x≤1e8)
 *
 * 输出描述
 * 对于每个询问，输出一个近似值。
 *
 * 样例输入
 * 5 5
 * 1 2 3 4 5
 * 3
 * 0
 * 7
 * 2
 * 5
 * 样例输出
 * 3
 * 1
 * 5
 * 2
 * 5
 */
public class RoundingNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            lowBound(a, x);
        }
    }

    public static void lowBound(int[] a, int x) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (a[mid] == x) {
                right = mid - 1;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left == 0) {
            System.out.println(a[left]);
        } else if (left == a.length || Math.abs(a[left] - x) >= Math.abs(a[left - 1] - x)) {
            System.out.println(a[left - 1]);
        } else {
            System.out.println(a[left]);
        }
    }
}



