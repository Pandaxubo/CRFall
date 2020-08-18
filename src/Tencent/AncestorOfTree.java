package Tencent;

import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description
 *
 * 给你一棵无限深度的满二叉树，节点的编号按层次依次编号，即第-层节点编号为1，第二层节点编号为2,3,
 * 第三层节点编号为4,5, 6...以此类推。
 * 接下来有Q次询问，每一次询问让你找一个编号为x的结点在深度为k的祖先节点的编号是多少?
 * 输入描述:
 * 输入第一行一个整数Q,代表有Q次询问
 * 接下来Q行，每一行输入两个数x和k。
 * 1<Q≤10^4
 * 1<x<10^{18}
 * 1<k<60
 * 输出描述:
 * 对于每一组测试数据，如果深度为K的祖先存在，输出结点编号，不存在输出-1
 *
 * //输入示例
 * 4
 * 10 1
 * 10 2
 * 10 3
 * 10 4
 * //输出示例
 * 1
 * 2
 * 5
 * -1
 */
public class AncestorOfTree {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int q = in.nextInt();
            for(int i=0;i<q;i++){
                long x = in.nextLong();
                int k = in.nextInt();
//                System.out.println(x);
//                System.out.println(k);
                System.out.println(hasFather(x,k));
            }
        }
    }
    public static long hasLevel(long x){
        long level = 0;
        long com = 1;
        while(x >= com){
            com<<=1;//com = com *2;
            level ++;
        }
        return level;

    }
    public static long hasFather(long x,int k){
        long level = hasLevel(x);
        if (k >= level) {
            return -1;
        }
        //一层层往上找父节点，总共需要计算level - k次
        for (int i = 0; i < level - k; i++) {
            if (x % 2 == 0) {
                x = x >>1;//x = x/2;
            }else {
                x = (x - 1) >> 1;
            }
        }
        return x;
    }
}
