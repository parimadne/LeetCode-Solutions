class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int index=0;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }else{
                cnt++;
                nums[index++]=nums[i];
                set.add(nums[i]);
            }
        }
        return cnt;
    }
}