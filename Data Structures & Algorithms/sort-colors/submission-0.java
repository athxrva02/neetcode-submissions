class Solution {
    public void sortColors(int[] nums) {
        int curr = 0, left = 0, right = nums.length - 1;
        int temp = 0;
        while(curr <= right) {
            if(nums[curr] == 0) {
               temp = nums[curr];
               nums[curr] = nums[left];
               nums[left] = temp;
               left++;
               curr++; 
            } else if (nums[curr] == 2) {
               temp = nums[curr];
               nums[curr] = nums[right];
               nums[right] = temp;
               right--; 
            } else {
                curr++;
            }
        }
    }
}