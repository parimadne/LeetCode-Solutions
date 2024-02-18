class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[]ch=new char[word1.length()+word2.length()];
       int i=0;
       int j=0;
       int k=0;
       while(i<ch.length){
           if(j<word1.length()){
               ch[i++]=word1.charAt(j++);
           }
           if(k<word2.length()){
               ch[i++]=word2.charAt(k++);
           }
       }
       return String.valueOf(ch);
    }
}