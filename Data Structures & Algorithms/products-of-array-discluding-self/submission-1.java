class Solution {
    public int[] productExceptSelf(int[] nums) {
        int freq = 0;
        int prod = 1;
        int zeroIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                freq++;
                zeroIndex = i;
            } else {
                prod *= nums[i];
            }
        }

        int[] res = new int[nums.length];
        if (freq >= 2) {
            return res;
        }

        if(freq == 1){
            res[zeroIndex] = prod;
            return res;
        }

        for(int i = 0; i < res.length; i++) {
            res[i] = prod / nums[i];
        }

        return res;
    }
}
