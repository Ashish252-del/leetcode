class SnapshotArray {
 int snaptime = 0;
    ArrayList<HashMap<Integer,Integer>> arr ;
    public SnapshotArray(int length) {
      arr  = new ArrayList<>(length);
        for(int i =0; i<length; i++)
            arr.add(new HashMap<Integer,Integer>());
    }
    
    public void set(int index, int val) {
  //arr.add(new HashMap<Integer,Integer>());
      //  arr.get(index).clear();
        arr.get(index).put(snaptime,val);
    }
    
    public int snap() {
       snaptime++;
        return snaptime - 1;
    }
    
    public int get(int index, int snap_id) {
        if(arr.get(index).isEmpty()) return 0;
        if(arr.get(index).containsKey(snap_id))  return arr.get(index).get(snap_id); 
        if (!arr.get(index).containsKey(snap_id)) {
           // return 0;
             while(snap_id>=0)
              { if (arr.get(index).containsKey(snap_id)) return arr.get(index).get(snap_id); snap_id--;}
           // return 0;
        }
       return 0; 
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */