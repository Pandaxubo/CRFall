package Qianxin;

import java.util.*;
/**
 * @author pandaxubo
 *
 * @description 老板发奖金，可以选择一次性发放1，2，。。。n元，整数即可。发放完n元奖金多少种方法(题目存在问题)
 * 目前已知方法： dp[n] = dp[n-1]+dp[n-2]+dp[n-3]。
 */
public class One {
    /**
     *
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     */
    public static int CalulateMethodCount (int num_money) {
        // write code here
        List<Integer> dp = new ArrayList<>(num_money+1);
        dp.add(1);
        dp.add(2);
        dp.add(4);
        for(int i = 3;i< num_money+1;i++){
            dp.add(dp.get(i-1)+dp.get(i-2)+dp.get(i-3));
        }
        return dp.get(num_money-1);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(CalulateMethodCount(in.nextInt()));
        }
    }
}