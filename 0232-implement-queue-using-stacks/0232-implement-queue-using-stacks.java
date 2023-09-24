class MyQueue {
   Stack<Integer> h ;
    public MyQueue() {
        h = new Stack<>();
    }
    
    public void push(int x) {
        h.push(x);
    }
    
    public int pop() {
         Stack<Integer> h2 = new Stack<>() ;
        int temp = h.size();
        while(h.size() >0) {
            h2.push(h.pop());
        }
        int ans = h2.pop();
        while(h2.size()>0) h.push(h2.pop());
        return ans;
    }
    
    public int peek() {
        Stack<Integer> h2 = new Stack<>() ;
        int temp = h.size();
        while(h.size() >0) {
            h2.push(h.pop());
        }
        int ans = h2.peek();
        while(h2.size()>0) h.push(h2.pop());
        return ans;
    }
    
    public boolean empty() {
        return h.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */