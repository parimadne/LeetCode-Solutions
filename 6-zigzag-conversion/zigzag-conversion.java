class Solution {
    public String convert(String s, int numRows) {
        StringBuffer[] rows=new StringBuffer[numRows];
        for(int i=0; i<rows.length;i++){
            rows[i]=new StringBuffer();
        }
        int i=0;
        while(i<s.length()){
            for(int idx=0; idx<numRows && i<s.length();idx++){
                rows[idx].append(s.charAt(i++));
            }
            for(int idx=numRows-2;idx>=1 && i<s.length();idx--){
                rows[idx].append(s.charAt(i++));
            } 
        }
            StringBuffer result=new StringBuffer();
           for(StringBuffer curr : rows){
               result.append(curr);
           }
        return result.toString();
    }
}