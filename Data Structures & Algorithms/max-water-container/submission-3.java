class Solution {
    public int maxArea(int[] heights) {

        if(heights.length == 2) {
            return Math.min(heights[0], heights[1]);
        }
        int left = 0, right = heights.length - 1;
        int maxArea = 1;

        while(left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);

            maxArea = Math.max(maxArea, area);

            if(heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }

        }

        return maxArea;

    }
}
