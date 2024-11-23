class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] ans = new char [box[0].length][box.length];
        reverse(box);
        for(int i =0; i<box.length; i++) {
            for(int j = 0; j<box[0].length; j++)
                ans[j][box.length-i-1] = box[i][j];
        }
        return ans ;
    }
    public void reverse(char[][] box){
        for(int i =0; i<box.length; i++) {
        for(int r = box[i].length -1; r>0; r--) {
             int l = r-1; 
            if(box[i][r] == '.') {
                while(l>0 && (box[i][l] == '.')) l--;
                if(box[i][l] == '*') continue;
                char t = box[i][l];
                box[i][l] = box[i][r];
                box[i][r] = t;
            }
        }
        }
    }
}