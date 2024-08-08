class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int totalCells = rows * cols;
        int leftLimit = cStart, rightLimit = cStart;
        int upLimit = rStart, downLimit = rStart;
        int visitedOrder[][] = new int[totalCells][2];
        int visitedIndx = 0;
        int currR = rStart, currC = cStart;
        visitedOrder[visitedIndx++] = new int[]{currR, currC};
        while(visitedIndx < totalCells){
           while(currC < rightLimit + 1){
              currC++;
              if(isInGrid(currR, currC, rows, cols) && visitedIndx < totalCells){
                visitedOrder[visitedIndx++] = new int[]{currR, currC};
              }
           }
           rightLimit++;
           while(currR < downLimit + 1){
            currR++;
            if(isInGrid(currR, currC, rows, cols) && visitedIndx < totalCells){
                visitedOrder[visitedIndx++] = new int[]{currR, currC};
            }
           }
           downLimit++;
           while(currC > leftLimit-1){
              currC--;
              if(isInGrid(currR, currC, rows, cols) && visitedIndx < totalCells){
                
                visitedOrder[visitedIndx++] = new int[]{currR, currC};
              }
           }
           leftLimit--;
           while(currR > upLimit-1){
              currR--;
              if(isInGrid(currR, currC, rows, cols) && visitedIndx < totalCells){
                
                visitedOrder[visitedIndx++] = new int[]{currR, currC};
              }
           }
           upLimit--;
        }
        return visitedOrder;
    }
    private boolean isInGrid(int r, int c, int rows, int cols){
        return r > -1 && c > -1 && r < rows && c < cols;
    }
}
