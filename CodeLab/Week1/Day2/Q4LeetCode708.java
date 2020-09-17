package Week1.Day2;

public class Q4LeetCode708 {
    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    ;

    public Node insert(Node head, int insertVal) {
        if (head == null) {
            head = new Node(insertVal);
            return head;
        }
        Node p = head;
        Node prev = p;
        boolean isInserted = false;
        do {
            if (insertVal < p.val) {
                isInserted = true;
                Node q = new Node(insertVal, prev.next);
                prev.next = q;
                p = p.next;
            } else {
                prev = p;
                p = p.next;
            }
        } while (isInserted || p == head);
        return head;
    }
}
