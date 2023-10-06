class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n=nums.size();
        
        vector<int> res;
        
        
         if(n==0){
         int lb=-1;
        int ub=-1;
              res.push_back(lb);
        res.push_back(ub);
    return res;
         }
        
int lb=lower_bound(nums.begin(),nums.end(),target)-nums.begin();
int ub=upper_bound(nums.begin(),nums.end(),target)-nums.begin()-1; 
    
    
    if(lb==n || nums[lb]!=target   ){
    lb=-1;
    ub=-1;
    }
        res.push_back(lb);
        res.push_back(ub);
    return res;
    }
};