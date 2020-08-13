package Practice;

/**
 * @author pandaxubo
 *
 * @description 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 5000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class ReverseList {
    public static ListNode reverseList1(ListNode head) {//双指针迭代
        ListNode pre = null;
        ListNode cur = head;//本来的顺序：pre在cur之后。一开始不能加上指向，否则后面反转会形成环。

        while (cur != null) {//如果传入的是空，循环就直接退出了。如果是1，则cur前进一位，第二次循环的时候就会退出，此时pre就是1于是返回。
            ListNode temp = cur.next;//保存cur下一节点
            cur.next = pre;//反转
            pre = cur;
            cur = temp;//往前进
        }

        return pre;//现在的cur为null了，pre自然成为反转链表的head
    }
    public static ListNode reverseList2(ListNode head) {//递归
        if(head == null || head.next == null){//只有一个节点｜｜已经到了尾节点
            return head;
        }//第一次结束返回尾节点，返回到50行的上一状态，即多节点时从最后两个节点的状态开始
        ListNode cur  = reverseList2(head.next);//第一组逐次调用为找到新链表头节点；第二组为依次返回新的递减的head计算
        head.next.next = head;//大转弯，反转操作，第一个head为cur-1
        head.next = null;//不删掉就是前驱和后继的环
        return cur;//存储新链表头节点，不overwrite
    }//多节点时顺序：先从头到尾，返回head，逆置最后两个，然后逐步往前。


    public static void main(String[] args){
        ListNode head = new ListNode(1293);
        head.next = new ListNode(222);
        head.next.next = new ListNode(3344);
        head.next.next.next = new ListNode(9847);
        System.out.println(reverseList1(head).val);

        ListNode headd = new ListNode(1293);
        headd.next = new ListNode(222);
        headd.next.next = new ListNode(3344);
        headd.next.next.next = new ListNode(9847);
        System.out.println(reverseList2(headd).val);
    }


}
