class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maximum = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (maximum < count)
                    maximum = count;
            } else if (c == ')') {
                count--;
            }
        }
        return maximum;
    }
}