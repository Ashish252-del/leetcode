class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        ArrayList<box> al = new ArrayList<>();
       for (int i =0; i<boxTypes.length; i++) {
           al.add(new box(boxTypes[i][0],boxTypes[i][1]));
       } 
        Collections.sort(al);
        int ans =0;
        int j =0;
        while(truckSize>0 && j <al.size()){
            box temp = al.get(j);
            if(truckSize>temp.a) {ans += (temp.a*temp.b); truckSize -= temp.a; }
            else {ans += (truckSize*temp.b); truckSize =0;}
            j++;
        }
        return ans;
    }
}

class box implements Comparable <box> {
    int a, b; 
    public box (int a , int b) {
        this.a = a ; this.b =b; 
    }
    public int compareTo(box that ) {
        return that.b- this.b;
    }
} 