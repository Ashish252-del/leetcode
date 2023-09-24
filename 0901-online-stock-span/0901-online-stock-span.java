class StockSpanner {
 Stack<Integer> h ;
    int stock ;
    int index = 0;
   ArrayList<Integer> val;
    public StockSpanner() {
        h = new Stack<>();
        val = new ArrayList<>();
    }
    
    public int next(int price) {
        
       while(h.size()>0 && val.get(h.peek()-1) <= price) h.pop();
        int left = (h.size()!=0? h.peek():0);
        index++;
        h.push(index);
        val.add(price); 
        return h.peek() - left;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */