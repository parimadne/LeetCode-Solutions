class Solution {
    public boolean isMatch(String s, String p) {
         boolean[][] match = new boolean[s.length() + 1][p.length() + 1];

        match[0][0] = true;

        for (int i = 1; i < match[0].length; i++) {
            if (p.charAt(i - 1) == '*') match[0][i] = match[0][i - 2];
        }

        for (int i = 1; i < match.length; i++) {
            for (int j = 1; j < match[0].length; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    match[i][j] = match[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    match[i][j] = match[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        match[i][j] = match[i][j] | match[i - 1][j];
                    }
                } else {
                    match[i][j] = false;
                }
            }
        }

        return match[s.length()][p.length()];
    }
}