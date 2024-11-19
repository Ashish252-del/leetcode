class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.equals(endWord)) return 0;
        Set<String> h = new HashSet<>();
        for(int i =0; i<wordList.size(); i++) h.add(wordList.get(i));
         h.remove(beginWord);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()) {
            Pair p = q.poll();
            if(p.word.equals(endWord)) return p.level;
          
            for(int j =0; j<p.word.length(); j++) {
            for(char i = 'a'; i<='z'; i++) {
                  char arr [] = p.word.toCharArray();
               arr[j] = i;
                String str = new String(arr);
                if(h.contains(str)) {
                    h.remove(str);
                    q.add(new Pair(str, p.level+1));

                }
            }
            }
        }
        return 0;
    }
}

class Pair {
    String word ;
    int level ;
    public Pair(String word , int level) {
        this.word = word;
        this.level = level;
    }
}