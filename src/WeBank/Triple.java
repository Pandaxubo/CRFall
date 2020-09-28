package WeBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author pandaxubo
 * @description 题目描述：
 * 给你一个长度为n的序列A，你需要算出有多少个三元组(Ai,Aj,Ak)满足i<j<k且Ai≤Aj≤Ak。
 *
 *
 *
 * 输入描述
 * 第一行一个整数n，表示序列A的长度。
 *
 * 接下来一行n个整数，第i个数表示Ai的值。
 *
 * 输出描述
 * 一个整数x，表示满足要求的三元组数量。
 *
 *
 * 样例输入
 * 6
 * 2 3 5 4 3 3
 * 样例输出
 * 6
 *
 * 提示
 * 范围：
 * n<=100000，A_i<=1000000
 */
public class Triple {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int n = in.nextInt();
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = in.nextInt();
//            }
//            boolean[] used = new boolean[n];
//            dfs(a,used);
//            System.out.println(path);
//        }
//    }
//    static private List<Integer> path = new ArrayList<>();
//    public static void dfs(int[] nums,boolean[] used){
//        if(path.size()==3){
//            ret++;
//            return;
//        }
//        for(int i = 1;i<nums.length;i++){
//            if(nums[i-1]>nums[i]||used[i-1]){
//                continue;
//            }
//            path.add(nums[i-1]);
//            used[i-1] = true;
//            dfs(nums,used);
//            path.remove(path.size()-1);
//            used[i-1] = false;
//        }
//    }
}
