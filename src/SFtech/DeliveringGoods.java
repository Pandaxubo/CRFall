package SFtech;

import java.util.Scanner;

/**
 * @author pandaxubo
 * @description 港口新到了n个货物，工人们需要将它们通过货车运送到公司。货物会先后到达港口，第i个到达港口的货物是第i号，价值是a[i]。
 * 现在有k辆货车，每辆货车可以将编号连续的货物一起运输，容量无限，运输费用为该车货物价值的和的平方，每辆车必须装载货物。
 * 你是运输货车公司的老板，你想在赚大钱的同时降低每辆车装载货物数以控制成本。
 * 请问最大的运输费用是多少，以及在费用最大时装载货物最多的货车至少需要装载多少货物。
 *
 * 输入
 * 第一行两个数n,k。
 *
 * 接下来n个数a[]，第i个数为a[i]。
 *
 * 输出
 * 两个数，第一个数表示最大运输费用，第二个数表示此时运输货物最多的货车最少需要装载的货物数量。
 *
 *
 * 样例输入
 * 6 3
 * 0 0 1 1 0 0
 * 样例输出
 * 4 2
 *
 * 提示
 * 1≤k≤n≤300
 * 0≤a[i]≤100
 *
 * 分组(1 2)(3 4)(5 6)，费用为0+2+0 = 2, 货车最大装载量为2。
 */


public class DeliveringGoods {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n =in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int maxincome = 0;
            int maxload = 0;
            for(int i =0;i<n;i++){
                a[i] = in.nextInt();
            }
            if(k == n/2){
               for(int j = 0;j<k;j++){
                   maxincome = Math.max(maxincome,(a[2*j]+a[2*j+1])*(a[2*j]+a[2*j+1]));
                   maxload = Math.max(maxload,a[2*j]+a[2*j+1]);
               }
                System.out.println(maxincome+" "+maxload);
            }
            else if(k> n/2){
                for(int j = 0;j<n/2;j++){
                    maxincome = Math.max(maxincome,(a[2*j]+a[2*j+1])*(a[2*j]+a[2*j+1]));
                    maxload = Math.max(maxload,a[2*j]+a[2*j+1]);
                }
                System.out.println(maxincome+" "+maxload);
            }
            else if(k< n/2){
                for(int j = 0;j<k;j++){
                    maxincome = Math.max(maxincome,(a[2*j]+a[2*j+1])*(a[2*j]+a[2*j+1]));
                    maxload = Math.max(maxload,a[2*j]+a[2*j+1]);
                }
                int restpo = 2*(k-1) +1;
                int restmaxincome = 0;
                int restmaxload = 0;
                for(int t = restpo;t<=n-2;t = t+2){
                    restmaxincome = Math.max(maxincome,(a[t]+a[t+1])*(a[t]+a[t+1]));
                    restmaxload = Math.max(maxincome,(a[t]+a[t+1])*(a[t]+a[t+1]));
                }
                maxincome += restmaxincome;
                maxload += restmaxload;
                System.out.println(maxincome+" "+maxload);
            }
        }
    }
}
