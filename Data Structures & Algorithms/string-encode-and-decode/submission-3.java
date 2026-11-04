class Solution {

    public String encode(List<String> strs) {
        // Need to somehow concatenate this into a single string. Position encoding?

        StringBuilder res = new StringBuilder();

        for(String str: strs) {
            res.append(str.length()).append("#").append(str);
        }
        System.out.println(res);
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j + length + 1);
            System.out.println(word);
            decoded.add(word);
            i = j + length + 1;
        }
        return decoded;
    }
}
