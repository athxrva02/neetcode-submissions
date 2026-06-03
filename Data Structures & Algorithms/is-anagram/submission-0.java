class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c: t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for(int freq: map.values()) {
            if(freq != 0) {
                return false;
            }
        }

        return true;
    }
}
