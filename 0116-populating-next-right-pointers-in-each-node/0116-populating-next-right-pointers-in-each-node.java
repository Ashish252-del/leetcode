/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
       ArrayList<Node> q = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()) {
             int n = q.size();
            Node temp = q.remove(0);
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
           // q.remove(0);
            
            for(int i =0 ;i<n-1; i++) {
                Node al = q.remove(0);
                temp.next = al;
                if(al.left!=null) q.add(al.left);
                if(al.right!=null) q.add(al.right);
                temp = al;
                
            }
            temp.next = null;
        }
        return root;
    }
}