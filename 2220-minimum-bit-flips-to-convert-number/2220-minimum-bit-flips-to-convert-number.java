class Solution {
    public int minBitFlips(int start, int goal) {
    int xorNumber = (start ^ goal); //(1)
    int counter = 0;

    while(xorNumber > 0){
        if((xorNumber & 1) == 1) //(2)
            counter++;
        xorNumber >>= 1; //(3)
    }

    return counter;
    }
}