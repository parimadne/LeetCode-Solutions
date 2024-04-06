class Solution {
    public String minRemoveToMakeValid(String s) {
       int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
            }
            else if(ch==')'&&!st.isEmpty()){
                st.pop();
            }
            else if(ch==')'&&st.isEmpty()){
                continue;
            }
            sb.append(ch);
        }
        int p=sb.length()-1;
        while(!st.isEmpty()){
            if(sb.charAt(p)=='('){
                sb.deleteCharAt(p);
                st.pop();        
            }
            p--;
        }
        
        return sb.toString(); 
    }
}