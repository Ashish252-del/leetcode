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
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        if(head==null) return null;
        ListNode curr = head;
        
        while(curr!=null) {curr = curr.next; cnt++;}
        cnt =( cnt/2); curr = head;
        while(cnt!=0) {
           curr = curr.next;
            cnt--;
        }
        return curr;
    }
}