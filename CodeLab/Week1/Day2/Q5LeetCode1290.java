package Week1.Day2;

public class Q5LeetCode1290 {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode p = head;
        while (p != null) {
            res = res * 2 + p.val;
            p = p.next;
        }
        return res;
    }
}
