

public class Q4LeetCode725 {
    class Solution {
        public ListNode[] splitListToParts(ListNode root, int k) {
            ListNode[] res = new ListNode[k];
            if (k == 1) {
                res[0] = root;
                return res;
            }
            ListNode p = root;
            int len = 0;
            while (p != null) {
                p = p.next;
                len++;
            }
            p = root;
            ListNode q = null;
            int lengthOfRest = len;
            for (int i = 0; i < k && p != null; i++) {
                int width = lengthOfRest / (k - i) + ((lengthOfRest % (k - i)) == 0 ? 0 : 1);
                lengthOfRest -= width;
                for (int j = 0; j < width && p != null; j++, p = p.next)
                    if (res[i] == null) {
                        res[i] = new ListNode(p.val);
                        q = res[i];
                    } else {
                        q.next = new ListNode(p.val);
                        q = q.next;
                    }
            }
            return res;
        }
    }
}
