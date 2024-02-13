class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] p = new int[26];
        for(char i : magazine.toCharArray()){
            p[i-'a']++;
        }
        for(char i: ransomNote.toCharArray()){
            p[i-'a']--;
        if(p[i-'a']<0){
            return false;
        }
        }
        return true;
    }
}