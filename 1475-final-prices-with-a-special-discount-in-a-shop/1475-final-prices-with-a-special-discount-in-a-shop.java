class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            int j = i + 1;
            while (j < prices.length) {
                if (prices[i] >=prices[j]) {
                    st.push( prices[i] - prices[j]);
                    
                    break;
                    // } else if (prices[i] < prices[j]) {
                    // j++;
                } 
                else {
                    j++;
                }
            }
            if (j == prices.length) {
                st.push(prices[i]);
            }
            // else{
            //    if( prices[i]==prices[j]){
            //     st.push(0);}
            // }

        }
        int[] arr = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;

    }
}