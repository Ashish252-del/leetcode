class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int arr [] = nums;
         ArrayList<Integer> ans = new ArrayList<>();
        int temp [] = new int [n]; 
        temp[0] = 1;
        for(int i =1; i<arr.length; i++) {
            temp[i] = 1;
            for(int j =0; j<i; j++) {
                if((arr[i] % arr[j] == 0) ) temp[i] = Math.max(temp[i], (1+temp[j]));
            }
        }
        int sol = 0;
        int curr = temp[0];
        for(int i =1; i<temp.length; i++) {
            if(temp[i]>curr) {sol = i; curr = temp[i];}
        }
        ans.add(arr[sol]); int tar = temp[sol]-1; 
        sol = sol-1;
        for(; sol >=0; sol--) {
           for(int i = 0 ; i<sol+1; i++) {
               if(tar == temp[i] && (ans.get(ans.size()-1) % arr[i] == 0 )) {
                   ans.add(arr[i]);
                   tar--;
                   break;
               }
           }
        }
         Collections.reverse(ans);
         return ans ;
    }
}