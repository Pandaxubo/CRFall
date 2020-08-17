package Tencent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * @author pandaxubo
 * @description 腾讯2020春招笔试题
 *
 * 第一题：模拟队列操作
 *
 * 数据结构基础之一一队列
 * 队列有五种基本操作，插入队尾、取出队首、删除队首、队列大小、清空队列。
 * 现在让你模拟一个队列的操作，具体格式参考输入。
 * 输入描述:
 * 第一行输入一个整数T，表示接下来有T组测试数据。
 * 对于每组测试数据:
 * 第一行输入一个整数Q，表示有Q次操作。
 * 接下来Q行，每行输入一种队列操作方式，具体格式如下:
 * 初始状态下队列为空。
 * 插入队尾: PUSH X
 * 取出队首: TOP//仅仅是看一下队首元素，不要把队首元素删除
 * 删除队首: POP
 * 队列大小: SIZE
 * 清空队列: CLEAR
 * 1<T<100
 * 1<Q,X≤1000
 * 保证操作为以上5种的任意一种。
 *
 * 输出描述
 * 对于每组测试数据:
 * 如果操作为“取出队首”，输出队首元素，如果无法取出，输出“-1”
 * 如果操作为“删除队首”，如果无法删除，输出“-1”
 * 如果操作为“队列大小”，输出队列大小
 * 其他操作无需输出
 *
 * 示例输入
 * 2
 * 7
 * PUSH 1
 * PUSH 2
 * TOP
 * POP
 * TOP
 * POP
 * POP
 * 5
 * PUSH 1
 * PUSH 2
 * SIZE
 * POP
 * SIZE
 *
 *
 *
 * 1
 * 2
 * -1
 * 2
 * 1
 */
public class QueueOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                Queue<Integer> q = new LinkedList<>();
                int o = in.nextInt();
                for (int j = 0; j < o; j++) {
                    String s = in.next();//多组输入
                    switch (s) {
                        case "PUSH":
                            q.offer(in.nextInt());
                            break;
                        case "TOP":
                            if (q.size() > 0) {
                                System.out.println(q.peek());
                            } else {
                                System.out.println(-1);
                            }
                            break;
                        case "POP":
                            if (q.size() > 0) {
                                q.poll();
                            } else {
                                System.out.println(-1);
                            }
                            break;
                        case "SIZE":
                            System.out.println(q.size());
                            break;
                        case "CLEAR":
                            int size = q.size();
                            while (size != 0) {
                                q.poll();
                                size--;
                            }//等价于 queue.clear();
                            break;
                    }
                }
            }
        }

    }
}

