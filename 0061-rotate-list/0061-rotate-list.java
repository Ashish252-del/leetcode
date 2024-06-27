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
    public ListNode rotateRight(ListNode head, int k) {
        int cnt = 1;
        ListNode curr = head;
        if(curr == null) return curr;
        while(curr.next != null) {curr = curr.next; cnt++;}
        k = k%cnt;
        if(k == 0) return head;
        ListNode st = head;
        ListNode b = head;
        int a = cnt - k;
        while (a-->0) {
            b=st;
            st = st.next;
        }
        b.next = null; 
        curr.next = head;
        return st;
    }
 
}