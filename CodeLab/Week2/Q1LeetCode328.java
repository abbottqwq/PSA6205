package CodeLab.Week2;

public class Q1LeetCode328 {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode oddhead = head;
            ListNode evenhead = head.next;
            ListNode odd = oddhead;
            ListNode even = evenhead;
            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenhead;
            return oddhead;
        }
    }
}