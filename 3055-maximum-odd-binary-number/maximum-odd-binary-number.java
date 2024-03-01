

class Solution {
    public String maximumOddBinaryNumber(String s) {
          int count1 = 0, count0 = 0;
        for (char a : s.toCharArray()) {
            if (a == '1') count1++;
            else if (a == '0') count0++;
        }
        StringBuilder ans = new StringBuilder();
        ans.append("1".repeat(count1 - 1));
        ans.append("0".repeat(count0));
        ans.append("1");
        return ans.toString();
    }
}