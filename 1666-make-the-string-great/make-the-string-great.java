class Solution {
    public String makeGood(String s) {
         StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            int m = ans.length();
            if (m > 0 && Math.abs(ans.charAt(m - 1) - s.charAt(i)) == 32) {
                ans.deleteCharAt(m - 1);
                i++;
            } else if (i + 1 < s.length() && Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                i += 2;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }
}