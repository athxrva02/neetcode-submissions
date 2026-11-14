class Solution {
    public boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while(left <= right) {
            char s = str.charAt(left);
            char e = str.charAt(right);

            if(!Character.isLetterOrDigit(s)) {
                left++;
            } else if (!Character.isLetterOrDigit(e)) {
                right--;
            } else if (Character.toLowerCase(s) != Character.toLowerCase(e)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
