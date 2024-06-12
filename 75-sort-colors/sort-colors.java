class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int num :nums){
            colors[num]++;
        }
        int i =0;
        for(int j =0;j<3;j++){
            while(colors[j]>0){
                nums[i]=j;
                colors[j]--;
                i++;
            }
        }
    }
}