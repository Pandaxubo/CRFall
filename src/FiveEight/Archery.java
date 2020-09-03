package FiveEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pandaxubo
 * @description
 *
 * 58技术部同学团建活动进行射击比赛，活动规则如下：
 * a、给每位同学发放m支箭，每次射箭命中的环数为0-10环（环数为整数脱靶为0环）
 * b、每轮比赛中，活动主办方会设置一个总环数n
 * c、每人射击完所有的箭后，命中的总环数（m支箭射出的总环数之和为n环则获胜）
 * 为了获得比赛胜利，参赛选手共有多少种射击方法？
 * 输入：发放箭的数量m， 总环数n
 * 输出：射击方法的数量
 * 测试用例：
 * 输入：8  40
 * 结果：9377467
 */
public class Archery {
    static Integer[] stack;// 存储单次结果
    static List<List<Integer>> result;// 存储结果集

    public static void main(String[] args) {
        int m = 8;
        int n = 40;
        // 总分40分，射箭5次，每次0~10分
        List<List<Integer>> res = combine(n, m, 10);
        System.out.println(res.size());
    }

    /**
     * @param totalScore 最后得分
     * @param totalTimes 射击次数
     * @param maxScore   每次射箭的最大分数
     */
    public static List<List<Integer>> combine(int totalScore, int totalTimes,
                                              int maxScore) {

        stack = new Integer[totalTimes];
        result = new ArrayList<>();

        dfs(0, 0, totalScore, totalTimes, maxScore);

        return result;
    }

    public static void dfs(int curTime, int curScore, int totalScore, int totalTimes,
                           int maxScore) {

        if (curTime == totalTimes && curScore == totalScore) {
            result.add(new ArrayList<>(Arrays.asList(stack)));
            return;
        }

        if (curTime == totalTimes || curScore > totalScore) {
            return;
        }

        for (int i = 0; i <= maxScore; i++) {
            stack[curTime] = i;
            dfs(curTime + 1, curScore + i, totalScore, totalTimes, maxScore);
        }
    }
}
