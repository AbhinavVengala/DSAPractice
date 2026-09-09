package TUF.Hashing;

public class MaxFrequencyLeetcode {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        for(int i=0; i<nums.length; i++) {
            freq[nums[i]] += 1;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }
        int total = 0;
        for(int f: freq) {
            if(f == maxFreq) {
                total += f;
            }
        }
        return total;
    }
}
