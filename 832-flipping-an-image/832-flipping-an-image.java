class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int n = image.length;
        for(int i=0;i<n;i++){
            int  low = 0;
            int high = n-1;
            while(low<high){
                int temp = image[i][low];
                 image[i][low] =  image[i][high];
                 image[i][high] = temp;
                
                high--;
                low++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j] = image[i][j]==0?1:0;
            }
        }
        return image;   
    }
}