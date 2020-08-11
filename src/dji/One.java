package dji;
import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description 自从零食间开始免费供应上好的咖啡豆，小杰每天午休后都会来到零食间，按下咖啡机的按钮，等待着杯里弥漫开来的香气把自己淹没，纷乱的思绪也渐渐在水雾中模糊。“小杰，你还有N个bug没修，别摸鱼了，快来解bug！”一个不合时宜的声音往往会在此时响起，小杰的脑海中瞬间闪过了无数个文件，无数行代码随着咖啡的香气不断滚动。
 * 　　“我是不可能写bug的，这辈子都不可能与bug的...",小杰边念叨着，一边开始在脑海里盘算起来。
 * 　　假设每喝一杯咖啡(喝咖啡的时间忽略不计）就能让自己一个小时内的debug效率提升到原来的A倍，- 小时内重复喝没用， 最多只能喝X杯，太多了晚上会睡不着， 并且为了保证可持续发展，每天最多只能专注工作8个小时，而在没喝咖啡的状态下解决每个bug所需要的时间为t1,t2.....tN分钟。
 *
 * 　　小杰的咖啡还没有喝完，你能帮他计算出他今天能解完所有bug吗?如果能，最少需要多长时间?
 *
 * 输入：
 *
 * 　　输入包含多组测试数据，每组数组:
 * 　　第一行有三个正整数N ，A， X分别表示，bug的总数，喝一杯咖啡在一小时内debug效率的倍数，最多可以喝的咖啡数。
 *
 * 　　(1 <=N<= 100,1 1=A<=8，1<=x<=8）
 * 　　第二行有N个正整数，由空格分割开，第i个正整数ti表示解决第i个bug需要的分钟数，(1<=ti<=1000)
 * 输出：
 * 　　对于每组测试数据:
 * 　　输出一个数字，如果不能解完所有bug.则输出0,如果可以，则输出最少需要的分钟数T (T为正整数，如不满分钟则按一分钟计算一且超过8小时则认为不能解完)
 *
 *
 * 样例输入：
 *
 * 8 2 8
 *
 * 60 60 60 60 60 60 60 60
 *
 * 4 3 3
 *
 * 333 77 100 13
 *
 * 样例输出：
 *
 * 240
 *
 * 175
 */

public class One {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int a = in.nextInt();
            int x = in.nextInt();
            int[] eacht = new int[n];
            int bugtime = 0;
            for (int i = 1; i <= n; i++) {
                eacht[i - 1] = in.nextInt();
                bugtime = bugtime + eacht[i - 1];
            }
            if (bugtime > 60 * x * a + (8 - x) * 60) {//核心语句，无需判断x是否超过n
                System.out.println("0");
            } else if (bugtime < 60 * x * a) {
                if (bugtime % a == 0) {
                    System.out.println(bugtime / a);
                } else {
                    System.out.println(bugtime / a + 1);
                }
            } else {
                int res = bugtime - 60 * x * a;
                System.out.println(60 * x + res);
            }
        }
    }
}
