class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, res = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
