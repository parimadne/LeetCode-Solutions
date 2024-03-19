class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int a = freq[25] - 1;
        int b = a * n;

        for (int i = 24; i >= 0; i--) {
            b -= Math.min(a, freq[i]);
        }

        return b < 0 ? tasks.length : tasks.length + b;
    }
}