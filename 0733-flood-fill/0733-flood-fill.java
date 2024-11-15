class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image,sr,sc,image[sr][sc],color);
        return image;
    }
     void fill(int[][] image, int i , int j , int c1, int c2) {
     if(image[i][j] != c1 || image[i][j] == c2) return ;
         image[i][j] = c2;
                int[][] directions = {
                    {-1, 0}, {1, 0}, {0, -1}, {0, 1}
                };
                
                for (int[] dir : directions) {
                    int newP = i + dir[0];
                    int newQ = j + dir[1];
                    
                    if (newP >= 0 && newP < image.length && newQ >= 0 && newQ < image[0].length 
                       ) {
                        
                        fill(image,newP, newQ, c1 , c2);
                    }
                }
            }
         
        
        
    }
