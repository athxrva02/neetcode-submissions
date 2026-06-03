class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        int temp;
        while(left <= right) {
            if(nums[left] == val) {
                nums[left] = nums[right];
                nums[right] = val;
                right--;
            }
            else {
                left++;
            }
        }   

        return right+1;
    }
}

