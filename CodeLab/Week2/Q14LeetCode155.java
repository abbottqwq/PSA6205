import java.util.Stack;

public class Q14LeetCode155 {
    class MinStack {
        private Stack<int[]> stack;

        /** initialize your data structure here. */
        public MinStack() {
            this.stack = new Stack<>();
        }

        public void push(int x) {
            if (this.stack.isEmpty()) {
                this.stack.push(new int[] { x, x });
            } else {
                this.stack.push(new int[] { x, Math.min(x, this.stack.peek()[1]) });
            }
        }

        public void pop() {
            this.stack.pop();
        }

        public int top() {
            return this.stack.peek()[0];
        }

        public int getMin() {
            return this.stack.peek()[1];
        }
    }
}
