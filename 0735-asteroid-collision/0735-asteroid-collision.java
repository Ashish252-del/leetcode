class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> h = new Stack<>();
        for(int i =asteroids.length -1; i>=0; i--) {
            while(!h.isEmpty() && ( (h.peek() <0 &&  asteroids[i]>0))
                 && (Math.abs(asteroids[i]) > Math.abs(h.peek())) ) { 
                h.pop();
            }
         if(!h.isEmpty() && ( (h.peek() <0 &&  asteroids[i]>0))) 
         {
             if(Math.abs(asteroids[i]) == Math.abs(h.peek())){ h.pop();
                                                             continue;}
         }
          if(h.isEmpty() || ((h.peek() >0 &&  asteroids[i]>0) || (h.peek() <0 &&  asteroids[i]<0))
            || (h.peek() >0 &&  asteroids[i]<0))h.push(asteroids[i]);
        }
        int ans [] = new int [h.size()];
        int i = 0;
        while(h.size()>0) {ans[i] = h.pop(); i++;}
        return ans;
    }
}