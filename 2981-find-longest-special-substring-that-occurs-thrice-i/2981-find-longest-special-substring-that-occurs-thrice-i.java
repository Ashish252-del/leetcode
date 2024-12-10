import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumLength(String s) {
        HashMap<String, Integer> h = new HashMap<>();
        generateSubStrings(s, h);
        int ans = -1;
        for (Map.Entry<String, Integer> e : h.entrySet()) {
            if (e.getValue() >= 3) ans = Math.max(ans, e.getKey().length());
        }
        return ans;
    }

    public void generateSubStrings(String s, HashMap<String, Integer> h) {
        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(j>i && s.charAt(j-1) != s.charAt(j)) break;
                str.append(s.charAt(j));
                String sub = str.toString(); // Convert StringBuilder to String
                h.put(sub, h.getOrDefault(sub, 0) + 1);
            }
        }
    }
}
