class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a: arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> p= new ArrayList<>();
        int count =0;
        for(int a:map.values()){
            p.add(a);
        }
        Collections.sort(p);
        for(int i =0;i<p.size();i++){
            if(k>p.get(i)){
                k=k-p.get(i);
                p.set(i,0);
            }else{
                p.set(i,p.get(i)-k);
                k=0;
            }
            if(p.get(i)!=0){
                count++;
            }
        }
        return count;
      }
}