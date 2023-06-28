class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int arr [] = new int [26];
        int brr [] = new int [26];
        List<Integer> ans = new ArrayList<>();
        int k = p.length();
        if(k>s.length()) return ans;
        for(int i =0; i<k; i++) {
            arr[s.charAt(i)-'a']++;
            brr[p.charAt(i)-'a']++;
            
        }
        for(int i =k; i<s.length(); i++){
            if(Arrays.equals(arr,brr)) ans.add(i-k);
            arr[s.charAt(i-k)-'a']--; arr[s.charAt(i)-'a']++;
        }
     if(Arrays.equals(arr,brr)) ans.add(s.length()-k);
        return ans;
    }
}