class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
      //  ArraysList<Robot> botList = new ArrayList<>();
        TreeMap<Integer,Robot> botList = new TreeMap<>();
        for(int i =0; i<positions.length; i++) 
            botList.put(positions[i], new Robot(positions[i],directions.charAt(i), healths[i]));
        Stack<Robot> h = new Stack<>();
        for (Map.Entry<Integer,Robot>r : botList.entrySet()) {
            Robot temp = r.getValue();
            if(r.getValue().dir == 'R') h.push(r.getValue());
            else {
                while(h.size()>0 && temp.hlth>0) {
                    Robot peek = h.peek();
                    if(peek.hlth == temp.hlth) {
                        botList.put(peek.pos, new Robot(peek.pos,peek.dir, 0)); 
                         botList.put(temp.pos, new Robot(temp.pos,temp.dir, 0)); 
                            h.pop();
                        temp = botList.get(temp.pos);
                                     }
                       else if (peek.hlth > temp.hlth) {
                           botList.put(peek.pos, new Robot(peek.pos,peek.dir, peek.hlth-1)); 
                         botList.put(temp.pos, new Robot(temp.pos,temp.dir, 0)); 
                      h.peek().hlth = peek.hlth-1;
                      temp = botList.get(temp.pos);
                       } 
                    else {
                        
                         botList.put(peek.pos, new Robot(peek.pos,peek.dir, 0)); 
                         botList.put(temp.pos, new Robot(temp.pos,temp.dir, temp.hlth-1)); 
                        h.pop();
                        temp = botList.get(temp.pos);

                    }
                                }
                               }
                             }
                                     
                                     
              ArrayList<Integer> ans = new ArrayList<>();         
            for(int i =0; i<positions.length; i++) {
                if(botList.get(positions[i]).hlth>0) ans.add(botList.get(positions[i]).hlth);
            }
                                     return ans ;
                  }
         }
            
        
    


class Robot {
    int pos ;
    char dir;
    int hlth;
    public Robot(int pos , char dir , int hlth ) {
        this.pos = pos ;
        this.dir = dir;
        this.hlth = hlth ;
    }
   
    
}