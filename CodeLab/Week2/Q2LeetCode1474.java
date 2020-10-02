

public class Q2LeetCode1474 {
    class Solution {
        public ListNode deleteNodes(ListNode head, int m, int n) {
            if (head == null) {
                return head;
            }
            ListNode p = head;
            while (p != null) {
                int rm = m, rn = n;
                while (--rm > 0) {
                    p = p.next;
                    if (p == null)
                        return head;
                }
                ListNode q = p.next;
                while (rn-- > 0) {
                    if (q == null) {
                        p.next = q;
                        return head;
                    }
                    q = q.next;

                }
                p.next = q;
                p = p.next;
            }
            return head;
        }
    }
}
