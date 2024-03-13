class Solution {
    public int pivotInteger(int n) {
        int left = 1, right = n;
        int Sum = (n * (n + 1)) / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int firstHalfSum = (mid * (mid + 1)) / 2;
            int secondHalfSum = Sum - firstHalfSum + mid;
            if (firstHalfSum == secondHalfSum)
                return mid;
            else if (firstHalfSum < secondHalfSum)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}