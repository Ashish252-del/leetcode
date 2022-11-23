class MyStack {
        Queue<Integer> one;
        Queue<Integer> two;

        public MyStack() {
            one = new LinkedList<>();
            two = new LinkedList<>();
        }

        public void push(int x) {
            one.add(x);
        }

        public int pop() {
            if (one.size() > 0) {
                while (one.size() > 1) {
                    two.add(one.poll());
                }
                return one.poll();
            } else {
                while (two.size() > 1) {
                    one.add(two.poll());
                }
                return two.poll();
            }
        }

        public int top() {
            if (one.size() > 0) {
                while (one.size() > 1) {
                    two.add(one.poll());
                }
                two.add(one.peek());
                return one.poll();
            } else {
                while (two.size() > 1) {
                    one.add(two.poll());
                }
                one.add(two.peek());
                return two.poll();
            }
        }

        public boolean empty() {
            return one.isEmpty() && two.isEmpty();
        }
}