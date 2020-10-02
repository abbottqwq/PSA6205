

public class Q11LeetCode203 {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode hidden = new ListNode(-1, head);
            ListNode prev = hidden;
            ListNode p = head;
            while (p!=null){
                if(p.val == val){
                    prev.next = p.next;
                    p = p.next;
                } else {
                    prev = p;
                    p = p.next;
                }
            }
            return hidden.next;
        }
    }
}
