package CodeLab.Week1.Day2;

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


    public Node insert(Node head, int insertVal) {
        if (head == null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }

        Node p = head;
        Node max = head;
        boolean isInserted = false;
        do {
            if (p.val <= insertVal && p.next.val >= insertVal) {
                isInserted = true;
                p.next = new Node(insertVal, p.next);
            }
            if (max.val <= p.val) max = p;
            p = p.next;
        } while (p != head && !isInserted);
        if (!isInserted) {
            max.next = new Node(insertVal, max.next);
        }
        return head;
    }
}
