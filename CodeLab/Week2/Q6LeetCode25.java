

public class Q6LeetCode25 {
    class Solution {
        public ListNode reverse1Group(ListNode head, int k) {
            if (k <= 1)
                return head;
            ListNode res = reverse1Group(head.next, k - 1);
            head.next.next = head;
            head.next = null;
            return res;

        }

        public ListNode reverseKGroup(ListNode head, int k) {
            int count = 0;
            ListNode p = head;
            while (count < k && p != null) {
                p = p.next;
                count++;
            }
            if (count < k)
                return head;
            ListNode res = reverse1Group(head, k);
            head.next = reverseKGroup(p, k);
            return res;
        }
    }
}
