class Solution {
    public boolean isPerfectSquare(int num) {
        double square = Math.sqrt(num);
        int val = (int) square;
        if((val*val)==num){
            return true;
        }
        return false;
    }
}