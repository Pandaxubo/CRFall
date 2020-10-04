package Weibo;

import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description 给定一个数，判断是不是回文数(Leetcode9)
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 如果是负数则一定不是回文数，直接返回 false
 * 如果是正数，则将其倒序数值计算出来，然后比较和原数值是否相等
 * 如果是回文数则相等返回 true，如果不是则不相等 false
 * 比如 123 的倒序 321，不相等；121 的倒序 121，相等
 *
 */
public class PalindRome {
    public static boolean isPalindrome(int tar) {
        int cur = 0;
        int temp = tar;
        while (temp != 0) {
            cur = cur * 10 + temp % 10;
            temp /= 10;
        }
        return cur == tar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int tar = in.nextInt();
            if (tar < 0) System.out.println("error");
            else {
                if (isPalindrome(tar)) System.out.println("true");
                else System.out.println("false");
            }
        }
    }
}
