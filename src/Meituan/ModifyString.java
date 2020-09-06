package Meituan;

import java.util.Scanner;

/**
 * @author pandaxubo
 * @description 题目描述：
 * 在小美的国家，任何一篇由英文字母组成的文章中，如果大小写字母的数量不相同会被认为文章不优雅。
 *
 * 现在，小美写了一篇文章，并且交给小团来修改。小美希望文章中的大小写字母数量相同，所以她想让小团帮她把某些小写字母改成对应的大写字母，或者把某些大写字母改成对应的小写字母，使得文章变得优雅。
 *
 * 小美给出的文章一定是由偶数长度组成的，她想知道最少修改多少个字母，才能让文章优雅。
 *
 *
 *
 * 输入描述
 * 输入包含一个字符串S，仅包含大写字母和小写字母
 *
 * |S|≤100000，|S|mod 2=0
 *
 * 输出描述
 * 输出包含一个整数，即最少需要修改的字符数。
 *
 *
 * 样例输入
 * AAAb
 * 样例输出
 * 1
 *
 * 提示
 * 修改为AaAb即可，也有其他两种修改方法：aAAb，AAab
 */
public class ModifyString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char[] s = in.nextLine().toCharArray();
            int small =0 ;
            int big = 0;
            for(int i = 0; i< s.length;i++){
                if(s[i] >='a' && s[i]<='z'){
                    small++;
                }
                if(s[i] >='A' && s[i]<='Z'){
                    big++;
                }
            }
            int avg = (small + big)/2;
            System.out.println(Math.max(small,big)-avg);
        }
    }
}
