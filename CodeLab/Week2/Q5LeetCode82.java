package CodeLab.Week2;


public class Q5LeetCode82 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode prev = head;
            ListNode p = head.next;
            while (p != null) {
                while (p.val == prev.val && p != null)
                    p = p.next;
                prev.next = p;
                p = p.next;
                prev = prev.next;
            }
            return head;
        }
    }
}
