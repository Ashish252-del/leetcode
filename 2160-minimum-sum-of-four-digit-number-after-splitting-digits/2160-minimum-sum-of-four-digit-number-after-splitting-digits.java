class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (num>0){ arr.add(num%10); num = num/10;}
        Collections.sort(arr);
        int a =( arr.get(0))*10 + arr.get(3);
         int b =( arr.get(1))*10 + arr.get(2);
        return a + b ;
    }
}