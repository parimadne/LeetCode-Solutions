class Solution {
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] ans= new double[nums1.length + nums2.length];
        merge(nums1, nums2, ans);
        
        
        if(ans.length%2==0){
            int i= ans.length/2;
            
            System.out.println(ans[i]+" "+ans[i-1]);
            double x= (ans[i]+ans[i-1])/2;
            return x; 
        }
        
        return ans[ans.length/2];
    }

    public static void merge(int[] arr1, int[] arr2, double[] ans){

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }else{
                ans[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }

        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }

    }
}