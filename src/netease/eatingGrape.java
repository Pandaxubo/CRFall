package netease;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author pandaxubo
 *
 * @description 链接：https://www.nowcoder.com/questionTerminal/14c0359fb77a48319f0122ec175c9ada
 * 来源：牛客网
 *
 * 有三种葡萄，每种分别有a,b,c颗。有三个人，第一个人只吃第1,2种葡萄，第二个人只吃第2,3种葡萄，第三个人只吃第1,3种葡萄。
 * 适当安排三个人使得吃完所有的葡萄,并且三个人中吃的最多的那个人吃得尽量少。
 *
 * 输入描述:
 * 第一行数字T，表示数据组数。
 * 接下来T行，每行三个数a,b,c
 * 1 <=a,b,c <= 10^{18} , 1<= T <=10
 *
 *
 * 输出描述:
 * 对于每组数据，输出一行一个数字表示三个人中吃的最多的那个人吃的数量。
 * 示例1
 * 输入
 * 2
 * 1 2 3
 * 1 2 6
 * 输出
 * 2
 * 3
 * 示例2
 * 输入
 * 1
 * 12 13 11
 * 输出
 * 12
 */
public class eatingGrape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            long[][] g = new long[num][3];//当心数组越界
            long c1,c2;
            for (int i = 0; i < num; i++) {
                g[i][0] = in.nextLong();
                g[i][1] = in.nextLong();
                g[i][2] = in.nextLong();
                Arrays.sort(g[i]);
            }
            for (int j = 0; j< num; j++) {
                c1 = (g[j][0]+g[j][1]+g[j][2] +2) /3;
                c2 = (g[j][2]+1)/2;
                //只有两种情况：
                //两个人吃完长边后不再吃短边，第三人吃完短边也没有超出另两个人；
                //两人吃完长边后，如果不帮第三人吃两个短边，会使第三人吃的超过2人。
                //第一种情况的输出就是长边的1/2；第二种情况则与三角形情况相同，需要所有人均分。

                System.out.println(Math.max(c1,c2));
            }
        }
    }
}
