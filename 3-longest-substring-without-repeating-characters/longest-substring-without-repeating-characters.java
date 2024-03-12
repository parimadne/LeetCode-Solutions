class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left = 0;
        int maxLength = 0;
        HashSet<Character> characters = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (characters.contains(s.charAt(right))) {
                characters.remove(s.charAt(left));
                left++;
            }

            characters.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;     
    }
}