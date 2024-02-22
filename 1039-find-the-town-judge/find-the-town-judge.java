class Solution {
    public int findJudge(int n, int[][] trust) {
       int []p=new int[n+1];
       int []r=new int[n+1];
       for(int[] a:trust){
           r[a[0]]++;
           p[a[1]]++;
       } 
       for(int i =1;i<=n;++i){
           if(p[i]==n-1 && r[i]==0){
               return i;
           }
       }
       return -1;
    }
}