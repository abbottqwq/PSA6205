package CodeLab.Week2;

public class Q5LeetCode82 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode hiddenhead = new ListNode(head.val - 1, head);
            ListNode prev = hiddenhead;
            ListNode p = hiddenhead.next;
            while (p.next != null) {
                if (p.next.val == p.val) {
                    while (p.next.val == p.val) {
                        p = p.next;
                        if (p.next == null) {
                            prev.next = null;
                            return hiddenhead.next;
                        }
                    }
                    prev.next = p.next;
                    p = prev.next;
                } else {
                    prev = p;
                    p = p.next;
                }
            }
            return hiddenhead.next;
        }
    }
}
