package CodeLab.Week1.Day2;

public class Q1LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        int count = 0;
        while (p.next != null) {
            p = p.next;
            count++;
            if (count > n) q = q.next;
        }

        if (count + 1 == n) {
            p = head;
            head = head.next;
            p = null;
        } else {
            p = q.next;
            q.next = p.next;
            p = null;
        }
        return head;
    }

}
