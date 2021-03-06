package Baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pandaxubo
 * @description
 * 李华顺利地到达了巴黎，他的好友Peter带他开启了他的巴黎之旅。
 * 途中，李华遇到了许多心动的纪念品想要带回家，但是他又不想自己太累，而且他买纪念品也有相应的预算k
 * 现给出他心动的纪念品清单：共有n件，其中每件都各有其价格price，重量weight，心动值v(其中心动值为1~5之间的数值)，
 * 需要注意的是：在心动值不同的情况下，李华会优先选择心动值大的纪念品；若心动值相同，李华会优先选择比较便宜的纪念品，具体见样例。
 * 同时给出李华在保证不累的情况下，最多能拿的物品重量m。在不超过预算并且保证不累的情况下，李华最多可以带几件纪念品回家？
 *
 * 输入描述
 * 单组输入。
 *
 * 第1行三个正整数，分别为：纪念品件数n，最多能拿的物品重量m，预算k。（n<1e5,m<100,k<10000,k的单位为元，m的重量为kg）
 *
 * 第2行到第n+1行，分别为每件物品的价格price，重量weight，心动值v。（price<10000,weight<100,v为1~5之间的整数，price的单位为元，weight的重量为kg）
 *
 * 输出描述
 * 在不超过预算并且保证不累的情况下，李华最多可以带回家的纪念品件数。
 *
 *
 * 样例输入
 * 3 10 1000
 * 100 5 3
 * 50 3 2
 * 300 3 3
 * 样例输出
 * 2
 *
 * 提示
 * 由于李华会优先选择心动值大的物品，所以李华选择了第一件和第三件物品。
 */
public class Souvenir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] goods = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                goods[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(goods, (o1, o2) -> {
            if (o1[2] < o2[2]) return 1;
            else if (o1[2] > o2[2]) return -1;
            else {
                if (o1[0] < o2[0]) return -1;
                else if (o1[0] > o2[0]) return 1;
                else {
                    if (o1[1] < o2[1]) return -1;
                    else return 1;
                }
            }
        });
        int res = 0;
        for (int i = 0; i < n; i++) {
            int price = goods[i][0];
            int weight = goods[i][1];
            if (k >= price && m >= weight) {
                res++;
                k -= price;
                m -= weight;
            }
        }
        System.out.println(res);
    }
}





