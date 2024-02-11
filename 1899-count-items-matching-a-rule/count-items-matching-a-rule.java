class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        if(ruleKey.equals("type")){
            ans=0;
        }else if(ruleKey.equals("color")){
            ans=1;
        }else{
            ans=2;
        }

        int cnt=0;

        for(List<String> str: items){
            if(str.get(ans).equals(ruleValue)) cnt++;
        }

        return cnt;
    }
}