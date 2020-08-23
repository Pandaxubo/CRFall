package Tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author pandaxubo
 * @description delete kth element of an linked list.
 * input:n(linklist length) k(kth)
 * every list of linklist
 * example:
 * 5 3
 * 1 2 3 4 5
 *
 * output:modified linklist
 * example:
 * 1 2 4 5
 *
 */
public class LinkedListkth {
    public static ListNode head;    //对第一个节点的引用
    public static ListNode current;    //对下一个节点的引用
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();

            int k = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            list.remove(k-1);
            for (int j = 0; j < n-1; j++) {
                System.out.print(list.get(j)+" ");
            }
        }
    }

    public ListNode remove(ListNode head, int n) {
        ListNode s = head, f = head;
        while (n > 0) {
            f = f.next;
            n--;
        }
        if (f == null) {
            return head.next;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return head;
    }

    public static void add(int data) {    //初始化每个节点
        if (head == null) {    //如果链表结构不存在
            head = new ListNode(data);    //初始化第一个节点
            current = head;    //引用指向本节点在只有一个节点的情况下
        } else {
            current.next = new ListNode(data);    //把本节点类中的成员变量next设为对下一个节点的引用
            current = current.next;    //指向下一个节点
        }
    }
}




    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }