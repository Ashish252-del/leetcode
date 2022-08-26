class Solution {
    public int countEven(int num) {
        int cnt =0;
        for (int i =2; i<=num; i++){
            if(dsum(i)%2==0) cnt++;
        }
        return cnt;
            
    }
    int dsum (int n) {
        int x =0;
       while(n>0){
           int curr = n%10;
           n=n/10;
           x+=curr;
       }
        return x;
    }
}