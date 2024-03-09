class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num1:nums2) {
            if(map.containsKey(num1)&& map.get(num1)>0){
                return num1;
            }
        }
        return -1;
    }
}