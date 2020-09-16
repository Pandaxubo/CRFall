package Xiaomi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author pandaxubo
 *
 * @description 题目描述：
 * 给定一个只包括'(',')','{','}','[',']' 的字符串,判断字符串是否有效。
 *
 * 有效字符串需满足:
 *
 *    1.左括号必须用相同类型的右括号闭合。
 *
 *    2. 左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串。
 *
 *
 *
 * 输入描述
 * 待判断的字符串，多个字符串需换行输入
 *
 * 输出描述
 * 每个字符串的判断结果，多个结果需换行输出
 *
 *
 * 样例输入
 * ()[]{}
 * ([)]
 * {[]}
 * 样例输出
 * true
 * false
 * true
 */
public class VaildString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.next();
            System.out.println(isVaild(s));
        }
    }

    public static boolean isVaild(String s){
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        char[] tar = s.toCharArray();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char c : tar){
//            if(c == '{'){
//                stack.push('}');
//            }
//            else if(c == '['){
//                stack.push(']');
//            }
//            else if(c == '('){
//                stack.push(')');
//            }
//            else if(stack.isEmpty() || c!= stack.pop()){
//                return false;
//            }
            if(map.containsValue(c)){
                stack.push(c);
            }
            else if(stack.isEmpty() || stack.pop()!=map.get(c)){
                return false;
            }
        }
        boolean res = stack.isEmpty();
        return res;
    }
}
