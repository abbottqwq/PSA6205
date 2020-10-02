

public class Q7LeetCode143 {
    class Solution {
        public ListNode doIt(ListNode head, ListNode right) {
            if (right == null)
                return head;
            ListNode curr = doIt(head, right.next);
            if (curr == null)
                return null;
            if (curr.next == right || right == curr) {
                right.next = null;
            } else {
                right.next = curr.next;
                curr.next = right;
            }
            return right.next;
        }

        public void reorderList(ListNode head) {
            doIt(head, head);
        }
    }
}
