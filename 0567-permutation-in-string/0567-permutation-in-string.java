class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a =s1.length();
        for(int i =0; i<=s2.length()-a; i++) {
            if(isPer(s1,s2.substring(i,i+a))) return true;
        }
        return false ;
    }
    public boolean isPer(String s1, String s2) {
        char a [] = s1.toCharArray();
        char b [] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return (Arrays.equals(a,b));
    }
}