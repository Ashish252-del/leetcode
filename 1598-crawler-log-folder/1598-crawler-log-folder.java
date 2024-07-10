class Solution {
    public int minOperations(String[] logs) {
        Stack <String> h = new Stack<>();
        int cnt = 0;
        for(int i =0; i<logs.length; i++) {
            if(logs[i].equals("../") && h.size()>0) h.pop();
        //    else if (logs[i].equals("../") && h.size() == 0) cnt++;
            else if (logs[i].equals("./")) continue ;
            else if (!logs[i].equals("../")) h.push(logs[i]);
        }
        return h.size();
    }
}