class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        int c = num; int p = num;
        while(num!=0){
            int curr = num%10;
            if(curr%2==0) even.add(curr);
            else odd.add(curr);
            num=num/10;
           
        }
         int ans = 0;
   
       
        while(c!=0) {
          
            int curr = c%10;
            if(curr%2==0) ans = ans*10 + (even.poll());
           
            else {ans = ans*10 + (odd.poll());}
            c=c/10;
        }
        int k =0;
        while(ans != 0)   
{  
int remainder = ans % 10;  
k = k * 10 + remainder;  
ans = ans/10;  
}  
 while(p>k) k = k*10;       
        return k;
    }
}