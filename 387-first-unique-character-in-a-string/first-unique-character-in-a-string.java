class Solution {
    public int firstUniqChar(String s) {
        int [] frequency = new int[26];
        char[] chars = s.toCharArray();
        for(char c: chars){
            frequency[c-'a']++;
        }
        for(int i =0;i<chars.length;i++){
            if(frequency[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}