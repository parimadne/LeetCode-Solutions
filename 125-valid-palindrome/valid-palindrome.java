class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
      int right =s.length()-1;
      int left = 0;
      while(right>left){
          if(s.charAt(left)==s.charAt(right)){
              left++;
              right--;
          }else{
              return false;
          }
      } 
       return true; 
    }
}