class Solution {
    public List<String> summaryRanges(int[] nums) {
       int n = 1; int start =-1 ;
        List<String> ans = new ArrayList<>();
        if(nums.length==0) return ans;
        start = nums[0];n = nums[0]; n++;
        for (int i =1; i<nums.length; i++) {
            if(nums[i] == n ) { 
          //  if(start==-1) {start = n ; n++;}
             n++;}
           else if (nums[i] != n) {
                if(  nums[i-1] == n-1 && start != n-1) {
                    String str = (start+"->")+(n-1);
                    ans.add(str) ; 
                   // return ans ;
                }
                else {ans.add(""+start);}
                n=nums[i]+1;;
                start = nums[i]; 
               
            }
        }
        if(nums.length>1&&nums[nums.length-2] == n-2) {  String str = (start+"->")+(n-1);
                    ans.add(str) ; }
        else {ans.add(""+start);}
        return ans ;
    }
}