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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans [][]= new int [m][n];
        for(int i =0; i<m; i++) {Arrays.fill(ans[i], -1);}
        int l =0, r = n-1, u = 0, d = m-1;
        while(head!=null && (l<=r && u<=d)) {
            for(int i = l; i<=r; i++) {
                if(head!=null)
               { ans[u][i] = head.val; head = head.next;}}
            u++;
            for(int i = u; i<=d; i++) {
                  if(head!=null)
               { ans[i][r] = head.val; head = head.next;}}
            r--;
          if(d>=u)  for(int i= r; i>=l ; i--) {
                              if(head!=null)
             { ans[d][i] = head.val; head = head.next;}}
            d--;
          if(r>=l)  for(int i = d; i>=u; i--) {
                              if(head!=null)
              {  ans[i][l] = head.val; head = head.next;} 
            }
            l++; 
        }
        return ans;
    }
}