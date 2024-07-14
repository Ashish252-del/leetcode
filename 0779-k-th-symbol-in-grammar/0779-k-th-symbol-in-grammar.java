class Solution {
    public int kthGrammar(int n, int k) {
        if(n ==1 && k ==1) return 0;
        int m = (int)Math.pow(2, n-1) / 2;
        if(k <= m) return kthGrammar(n-1,k);
        return 1 - kthGrammar(n-1, k-m);
    }
}