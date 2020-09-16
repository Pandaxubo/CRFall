package Xiaomi;

import java.util.*;

/**
 * @author pandaxubo
 * @ 题目描述：
 * 给定一个字符串, 需要去除所有之前曾经出现过的字符，只保留第一次出现的字符
 *
 *
 *
 * 输入描述
 * 输入
 *
 * 输出描述
 * 输出
 *
 *
 * 样例输入
 * hello, welcome to xiaomi
 * 样例输出
 * helo, wcmtxia
 */
public class SelectString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            System.out.println(select(s));
        }
    }

    public static String select(String s){
        ArrayList<Character> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(char c :s.toCharArray()){
            if(!list.contains(c)|| c == ',')   list.add(c);
        }
        for(char c: list)   sb.append(c);
        return sb.toString();
    }
}
