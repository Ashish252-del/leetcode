class Solution {
    public List<Integer> grayCode(int n) {
        List l=new ArrayList<>();

    for(int i=0;i<Math.pow(2,n);i++) l.add(i^(i>>1));
    return l;
    }
}