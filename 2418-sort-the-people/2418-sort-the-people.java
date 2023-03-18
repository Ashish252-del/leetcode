class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String [] res = new String[names.length];
        Map<Integer, String> map = new HashMap();  

        for (int i = 0; i < names.length; i++) map.put(heights[i], names[i]);

        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(map);

        int index = res.length - 1;
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            res[index] = entry.getValue();
            index--;
        }
        return res;
    }
}