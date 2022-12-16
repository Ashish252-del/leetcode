//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
      HashMap<Character, Integer> m = new HashMap<>();
      for(int i=0; i<s.length(); i++) {
         char ch = s.charAt(i);
         if(m.containsKey(ch)) m.put(ch,m.get(ch)+1);
         else m.put(ch,1);
      }
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      
      for(Map.Entry<Character,Integer>e:m.entrySet()){
        pq.add(e.getValue());  
      }
      while(k-->0){
          int curr = pq.poll();
          curr--;
          pq.add(curr);
      }
      int ans =0;
      while (!pq.isEmpty()) {
          int temp = pq.poll();
          temp = temp*temp;
          ans = ans +temp;
      }
      return ans;
    }
}