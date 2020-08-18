package Tencent;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author pandaxubo
 * @description
 *
 * 用两个栈实现队列，支持队列的基本操作。
 * 输入描述:
 * 第一行输入一个整数N，表示对队列进行的操作总数。下面N行每行输入一个字符串S，表示操作的种类。
 * 如果s为"add"，则后面还有一个整数x表示向队列尾部加入整数X。
 * 如果S为"poll"，则表示弹出队列头部操作。
 * 如果s为"peek"，则表示询问当前队列中头部元素是多少。
 * 1 < N< 1000000, -1000000 < X < 1000000
 * 数据保证没有不合法的操作。
 * 输出描述:
 * 对于每一个为"peek"的操作，输出一行表示当前队列中头部元素是多少。
 *
 * //输入示例
 * 6
 * add 1
 * add 2
 * add 3
 * peek
 * poll
 * peek
 * //输出示例
 * 1
 * 2
 */
public class StackImplementQueue {
    private static final Stack<Integer> stack1 = new Stack<>();
    private static final Stack<Integer> stack2 = new Stack<>();

    public static void add(int node) {
        stack1.push(node);
    }

    public static void poll() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }

    public static void peek() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.peek());
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0;i<n;i++){
                String s = in.next();
                switch (s){
                    case "add":
                        add(in.nextInt());
                        break;
                    case "poll":
                        poll();
                        break;
                    case "peek":
                        peek();
                        break;
                }
            }
            in.close();
    }
}

