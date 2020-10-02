
public class Q9LeetCode24 {
    class Solution {
        public ListNode doIt(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode first = head;
            ListNode next = head.next;
            ListNode res = doIt(head.next.next);
            first.next = res;
            next.next = first;
            return next;

        }

        public ListNode swapPairs(ListNode head) {
            return doIt(head);

        }
    }
}
