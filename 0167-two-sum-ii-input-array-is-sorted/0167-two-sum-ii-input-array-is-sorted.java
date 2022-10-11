class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l =0, h = numbers.length-1;
        int [] ans = new int [2];
        
        while(h>l){
            int curr = numbers[l]+numbers[h];
            if(numbers[l]+numbers[h]==target) {ans[0]=l+1; ans[1]=h+1; break;}
            if(curr>target) h--;
            else l++;
        }
        return ans;
    }
}