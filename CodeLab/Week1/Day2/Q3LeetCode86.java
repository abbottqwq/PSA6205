package CodeLab.Week1.Day2;

public class Q3LeetCode86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode leftHead = null;
        ListNode rightHead = null;
        ListNode p = head;
        ListNode leftP = null;
        ListNode rightP = null;
        while (p != null) {
            int val = p.val;
            if (p.val < x) {
                if (leftHead == null) {
                    leftHead = new ListNode(val);
                    leftP = leftHead;
                } else {
                    ListNode q = new ListNode(val);
                    leftP.next = q;
                    leftP = leftP.next;
                }
            } else {
                if (rightHead == null) {
                    rightHead = new ListNode(val);
                    rightP = rightHead;
                } else {
                    ListNode q = new ListNode(val);
                    rightP.next = q;
                    rightP = rightP.next;
                }
            }
            p = p.next;
        }
        if(leftHead == null) return rightHead;
        if(rightHead == null) return leftHead;
        leftP.next = rightHead;
        return leftHead;
    }
}
