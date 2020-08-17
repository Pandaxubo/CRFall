package Qianxin;

import java.util.*;

/**
 * @author pandaxubo
 * @description 输入一个字符串，空格隔开，遇见undo删除前面一个单词，redo撤销删除，最后输出。
 * 例如 输入 hello undo redo world. 输出 hello world.
 * 本题特定条件：undo后面只要有至少一个有效的字符串，则后面的对应redo无效。
 */

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("\\s+");//匹配多个空格（java中双斜杠代表单斜杠，\s匹配任意空格字符，+代表一次或多次匹配前面的字符或子表达式）
        System.out.println(Cal(strs));
    }
    public static String Cal (String[] strs) {
        Stack<String> stack1 = new Stack<> ();//存放undo元素
        Stack<String> stack2 = new Stack<> ();//存放res
        for (String str:strs){
            if (str.equals("undo")) {
                if (stack2.size()>0) {
                    System.out.println("stack2_b4: " + stack2);
                    stack1.push(stack2.pop());//从s2拿出放入s1
                    System.out.println("stack2_after: " + stack2);
                }
            } else if (str.equals("redo")) {
                if (stack1.size()>0) {
                    System.out.println("stack1_b4: " + stack1);
                    stack2.push(stack1.pop());
                    System.out.println("stack1_after: " + stack1);
                }
            } else {
                stack2.push(str);
            }

        }//完成循环时，s1中保存了所有undo了但是没有redo的值，s2即为所求，加上空格即可
        String[] s = new String[stack2.size()];
        int i = stack2.size()-1;
        while (stack2.size()>0) {
            s[i] = stack2.pop();
            --i;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j<s.length; ++j) {
            sb.append(s[j]);
            if (j < s.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();//别忘了sb的append和tostring方法，还有常用的reverse以及delete(start,end),deletecCharAt(index)
    }
}




