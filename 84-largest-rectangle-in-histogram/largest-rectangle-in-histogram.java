class Solution {
    public int largestRectangleArea(int[] heights) {
        // brute force
        // int maxArea=0;
        // int n = heights.length;
        // for(int i=0;i<n;i++){
        //     int l=-1,r=n,h=heights[i];
        //     for(int j=i;j>=0;j--){
        //         if(heights[j]<h){
        //             l=j;
        //             break;
        //         }
        //     }
        //     for(int j=i;j<n;j++){
        //         if(heights[j]<h){
        //             r=j;
        //             break;
        //         }
        //     }
        //    int w=r-l-1;
        //     maxArea=Math.max(maxArea,h*w);

        // }
        // return maxArea;

        // optimized solution
             int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] previous_smaller = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                    heights[st.peek()] >= heights[i]) st.pop();
            if (st.isEmpty()) {
                previous_smaller[i] = -1;
            } else {
                previous_smaller[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();

        int[] next_smaller = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&
                    heights[st.peek()] >= heights[i]) st.pop();
            if (st.isEmpty()) {
                next_smaller[i] = n;
            } else {
                next_smaller[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = next_smaller[i] - previous_smaller[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}