package netease;

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
            int[][] g = new int[num][3];
            for (int i=0;i< num;i++){
                g[i][0] = in.nextInt();
                g[i][1] = in.nextInt();
                g[i][2] = in.nextInt();

            }
            for (int i=0;i< num;i++){
                int avg = (g[i][0]+g[i][1]+g[i][2])%3;
                if(avg == 0){
                    System.out.println((g[i][0]+g[i][1]+g[i][2])/3);
                }
                else if(avg == 1){
                    System.out.println((g[i][0]+g[i][1]+g[i][2])/3+1);
                }
                else if(avg == 2){
                    System.out.println((g[i][0]+g[i][1]+g[i][2])/3+1);
                }
            }


        }
    }

}