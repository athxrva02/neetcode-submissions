class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]) {
                // means that answer is on the left, shift right boundary to mid
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left]; // Return left most since it would be the smallest
    }
}
