import java.util.Hashtable;
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Hashtable <Integer,List<Integer>> hash = new Hashtable<>();
        for(int i=0;i<groupSizes.length;i++){
            List<Integer> group = new ArrayList<>();
            if(groupSizes[i]== 1){
                group.add(i);
                ans.add(group);
            }else{
                if(hash.containsKey(groupSizes[i])){
                    group = hash.get(groupSizes[i]);
                    if(groupSizes[i]-1>group.size()){
                        group.add(i);
                    }else{
                        hash.remove(groupSizes[i]);
                        group.add(i);
                        ans.add(group);
                    }
                }else{
                    group.add(i);
                    hash.put(groupSizes[i],group);
                }
            }
        }
        return ans;
    }
}