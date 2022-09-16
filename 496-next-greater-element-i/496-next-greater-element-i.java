class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
      ArrayList<Integer>list =new ArrayList<Integer>();
        int j =0;// this is for nums1
        int count=0;
        for(int i=0;i<nums2.length;i++){//this is for nums2
            if(nums1[j]==nums2[i]){
                for(int a =i; a<nums2.length;a++){
                    if(nums1[j]<nums2[a]){
                        count=nums2[a];
                        break;
                    }
                }
                if(count==0){
                    list.add(-1);
                    j++;
                }
                else{
                    list.add(count);
                    count=0;
                    j++;
                }

            }
            if(i>=nums2.length-1){
                i=-1;
            }
            if(j==nums1.length){
                break;
            }

        }
            int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
            return ans;
    }
}