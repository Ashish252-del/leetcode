class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = left; i<=right; i++)
            if(check(i)) ans.add(i);
        return ans;
    }
    boolean check (int a) {
        int x = a;
        while(x!=0){
            int t = x%10;
            if(t==0||(a%t!=0)) return false; 
            x=x/10;
        }
        return true;
    }
}