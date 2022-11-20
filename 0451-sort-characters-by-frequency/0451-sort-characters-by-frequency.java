class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            if(h.containsKey(s.charAt(i))) h.put(s.charAt(i),h.get(s.charAt(i))+1);
          else h.put(s.charAt(i),1);
        }
        PriorityQueue <freq> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Map.Entry<Character, Integer> e : h.entrySet()) {
            pq.add(new freq(e.getKey(), e.getValue()));
        }  
        String ans = "";
        while(!pq.isEmpty()){
            freq curr = pq.poll();
            char ch = curr.c; int t = curr.f;
            while(t>0){ans =ans+ch; t--;}
        }
        return ans;
    }
}
class freq implements Comparable<freq> {
   char c; int f;
    public freq (char c, int f){
        this.c =c ; this.f = f;
    }
    public int compareTo(freq that){
        return this.f-that.f;
    }
}