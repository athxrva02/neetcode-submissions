class Solution {
    public int maxArea(int[] height) {
        if(height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int left = 0, right = height.length - 1;
        int maxArea = 1;

        while(left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);

            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}