class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
         Set<String> s = new HashSet<>(dictionary);
        StringBuilder res = new StringBuilder();
        List<String> temp = new ArrayList<>(
            Arrays.asList(sentence.split(" "))
        );
        
        for (String t : temp) {
            int i = 0;
            while (i <= t.length()) {
                String curr = t.substring(0, i++);
                if (s.contains(curr)) {
                    res.append(curr).append(" ");
                    break;
                }

                if (i == t.length() + 1) res.append(t).append(" ");
            }
        }
        
        res.deleteCharAt(res.length() - 1); 
        return res.toString();
    }
}