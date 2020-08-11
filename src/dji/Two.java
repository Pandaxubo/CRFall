package dji;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author pandaxubo
 * @description
 * 　　在零食间里有一个季食柜，里面会半价供应很多好吃的零食，柜子被隔成了一个个小格子，类似一个矩阵，每个格子里会放置由前台小姐姐们精心挑选的零食，并且标上相应的价格。
 * 　　小A是个大吃货，每天他都要光顾次零食间，但是他又要减肥，于是他便对自己做了一个约束，每次只能从里面拿走总价格少于V的零食。这时候问题来了，对于每种零食，小A都有一个内心的满意度，小A希望每次都能吃上让自己最满意的零食。假设零食柜里每个格只放置N种零食， 每种零食的数量是有限的，买完就没有了，季食只能按照整数倍购买，不能只买半件。问小A在有限价格内买到的季食的总满意度最高是多少?
 *
 * 输入：
 *
 * 　　输入包含多组测试数据，每组数组:
 * 　　第一行有两个正整数N, T,分别表示，零食的种类数目和小A最多用于购买零食的口钱。(1<=N<= 100,1 <=T <= 10000)
 * 　　接下来有N行， 每行有三个正整数用空格隔开，按顺序表示零食需要的价格v，满意度和零食的数量c。
 *
 * 　　(1 <=V<= 100, 1 <=l<=100, 1<=c<= 100）
 *
 * 输出：
 * 　　对于每组测试数据:
 * 　　输出一个正整数如果无法购买任何一个零食输出0，否则输出最大的满意度。
 *
 *
 * 样列输入：
 * 2 10
 *
 * 1 1 1
 *
 * 1 1 1
 *
 * 3 100
 *
 * 26 100 4
 *
 * 5 1 4
 *
 * 5 2 2
 * 样例输出：
 * 2
 * 306
 *
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            ArrayList<Merchandise> arr = new ArrayList<>();
            int res = 0;

            for (int i = 0; i < n; i++) {
                arr.add(new Merchandise(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
            }
            for (int i = 0; i < n-1; i++) {
                for (int j =  n-1; j >i; j--) {
                    Merchandise o1 = arr.get(j-1);
                    Merchandise o2 = arr.get(j);
                    if(o1.avg>o2.avg){
                        arr.set(j,o1);
                        arr.set(j-1,o2);
                    }
                }
            }
            for (int i = n-1; i >= 0; i--) {
                Merchandise o1 = arr.get(i);
                while (t>=o1.v&&o1.c>0){
                    o1.c--;
                    t-=o1.v;
                    res+=o1.l;
                }
            }
            System.out.println(res);
        }

    }

    static class  Merchandise{
        int v;
        int l;
        int c;
        double avg;

        public Merchandise(int v, int l, int c) {
            this.v = v;
            this.l = l;
            this.c = c;
            avg = l/(double)v;
        }
    }

}
