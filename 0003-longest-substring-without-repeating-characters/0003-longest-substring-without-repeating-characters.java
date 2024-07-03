class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        if (n <= 1) {
            return n;
        }

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }
            map.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}