class LRUCache {
    int size ;
    HashMap<Integer, Node> h ;
    Node head ;
    Node tail;
    public LRUCache(int capacity) {
        size = capacity ;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head; 
        h = new HashMap<>();
    }
    
    public int get(int key) {
       if(h.containsKey(key)) {
           Node curr = h.get(key);
           this.remove(curr);
           this.insert(curr);
           return curr.val;
       }
        return -1;
    }
    
    public void put(int key, int value) {
        if(h.containsKey(key)) this.remove(h.get(key));
        if(size == h.size()) this.remove(tail.prev);
        this.insert(new Node (key, value));
    }
    private void insert (Node node) {
        h.put(node.key, node);
        node.next = head.next ; 
        node.next.prev = node; 
        head.next = node ;
        node.prev = head ; 
        
    }
    private void remove (Node node ) {
        h.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev; 
    }
}

 class Node {
     int key ; 
     int val ; 
     Node prev ; 
     Node next ;
     Node (int key , int val ) {
         this.key = key ; 
         this.val = val ; 
         
     }
 } 

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */