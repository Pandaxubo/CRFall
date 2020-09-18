package Pingan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author pandaxubo
 *
 * @description
 * 题目描述
 * 小乐乐学会了自定义函数，BoBo老师给他出了个问题，根据以下公式计算m的值。
 * res = max3(a+b,b,c)/(max3(a,b+c,c)+max3(a,b,b+c));
 * 其中 max3函数为计算三个数的最大值，如： max3(1, 2, 3) 返回结果为3。
 * 输入描述:
 * 一行，输入三个整数，用空格隔开，分别表示a, b, c。
 * 输出描述:
 * 一行，一个浮点数，小数点保留2位，为计算后m的值。
 */
public class CalcExpression {
    public static float max(int a, int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            float res = max(a+b,b,c)/(max(a,b+c,c)+max(a,b,b+c));
            DecimalFormat df = new DecimalFormat(".00");
            System.out.println(df.format(res));
        }
    }
}
