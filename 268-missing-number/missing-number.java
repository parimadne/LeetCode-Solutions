class Solution {
    public int missingNumber(int[] nums) {
       int x = 0;
       for(int i =0;i<=nums.length;i++){
           x = x^i;
       } 
       for(int num:nums){
           x = x^num;
       }
       return x;
    }
}