class Solution {
    public int maxFrequencyElements(int[] nums) {
         int maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }
        int[] temp = new int[maximum + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == max) {
                count++;
            }
        }
        return count * max;
    }
}