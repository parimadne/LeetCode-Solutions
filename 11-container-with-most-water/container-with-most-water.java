class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int i=0;
        int j =height.length-1;
        while(i<j){
            int w = j-i;
            int h =0;
            if(height[j]>height[i]){
                h=height[i];
                i++;
            }else{
                h=height[j];
                j--;
            }
            int area = h*w;
            if(area>max){
                max = area;
            }
        }
        return max;
    }
}