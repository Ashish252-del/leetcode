class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans = customers[0][1];
        int t = customers[0][0] + customers[0][1];
        for(int i = 1; i<customers.length; i++) {
          if(t >= customers[i][0])  {t += customers[i][1];
            ans += (t - customers[i][0]);}
            else {
                t = customers[i][0] + customers[i][1];
                ans += customers[i][1];
            }
        }
        return ans/customers.length ;
    }
}