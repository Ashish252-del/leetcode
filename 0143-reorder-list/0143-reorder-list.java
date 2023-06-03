/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
       if(head == null ) return ;
        Stack<ListNode> s = new Stack<>();
        ListNode temp = head;
        while (temp!=null) {s.add(temp); temp = temp.next;}
      rearrange(head,s);  
        
    }
    public void rearrange (ListNode curr ,  Stack<ListNode> s) {
        if(curr == s.peek()) return;
      ListNode m = s.pop();
        ListNode t = curr.next ;
        curr.next = m ;
        if(t==m) return;
        m.next = t;
     if(!s.isEmpty())  s.peek().next = null;
        rearrange(t, s);
    }
}