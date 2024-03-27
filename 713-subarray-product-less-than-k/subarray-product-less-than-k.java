class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int Product = 1, left = 0, right = 0, len = nums.length;
        int Count = 0;
        while(right < len){
            Product *= nums[right];
            while(Product >= k && left <= right){
                Product /= nums[left++];
            }
            if(left <= right)
                Count+= right - left + 1;
            right++;
        }
        return Count;
    }
}