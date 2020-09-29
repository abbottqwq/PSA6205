package CodeLab.Week2;

public class Q6LeetCode25 {
    class solution {
        public ListNode reverse1Group(ListNode firstNode, int k) {
            if (k == 0)
                return firstNode;
            return reverse1Group(firstNode, k - 1);
        }

        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode p = head;
            while (p != null) {
                int count = 0;
                while (p != null && count < k) {

                }
            }
            return head;
        }

    }
}
