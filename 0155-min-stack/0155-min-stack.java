class MinStack {
   long getmin ;
    Stack<Long> h ; 
    public MinStack() {
        h = new Stack<Long>();
    }
    
    public void push(int val) {
       if(h.size() ==0) {
           h.push((long)val);
           getmin = (long)val;
       }
        else if (val >=getmin) {
            h.push((long)val);
        }
        else {
            h.push((2*(long)val) - getmin);
            getmin = (long)val;
        }
    }
    
    public void pop() {
        if(h.size() ==0) return;
       if(getmin<=h.peek())  h.pop(); 
        else {
            long t = getmin ; 
            getmin = (2*t) - h.pop(); 
       //     if(h.size() ==0) getmin = null;
          //  return t;
        }
    }
    
    public int top() {
       if(getmin<=h.peek()) {
           long a = h.peek();
           return (int)a;}
        return (int)getmin;
    }
    
    public int getMin() {
      return (int)getmin;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */