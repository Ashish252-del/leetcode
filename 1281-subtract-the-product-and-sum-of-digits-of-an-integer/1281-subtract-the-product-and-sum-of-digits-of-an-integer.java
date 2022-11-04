class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n>0){
            int curr = n%10;
            p *=curr;
            s +=curr;
            n=n/10;
        }
        return (p-s);
    }
}