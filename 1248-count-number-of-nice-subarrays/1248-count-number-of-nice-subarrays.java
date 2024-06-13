class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int st = 0; int o = -1; int ans = 0; int cnt = 1;
        for(int i =0; i<nums.length ; i++) {
            if(nums[i] % 2 != 0) {
                o = i;
                break; 
            }
        }
        if (cnt == k) ans = (o+1);
        for(int i =o+1; i<nums.length; i++) {
            if(nums[i] % 2 == 1) cnt++;
            while(cnt > k) {
                if(nums[st] %2 != 0) cnt--;
                st++;
                if(cnt == k ) {
                    o = st;
                    while (nums[o] % 2 ==0) o++;
                }
            }
            if(cnt == k) ans += ((o-st)+1);
        }
        return ans ;
    }
}