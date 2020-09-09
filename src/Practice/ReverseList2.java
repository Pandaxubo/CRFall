package Practice;

public class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode hd = new ListNode(0);
        hd.next = head;
        ListNode start = hd;
        ListNode end ;
        for (int i = 0; i < m-1; i++) {
            start = start.next;
        }
        end = start.next;
        for (int i = m; i < n; i++) {
            end = end.next;
        }
        reverse(start,end);
        return hd.next;
    }

    private void reverse(ListNode start, ListNode end){
        ListNode cur = start.next;
        ListNode pre = end.next;
        ListNode temp;
        while(cur != end){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        cur.next =pre;
        start.next = end;
    }

}
