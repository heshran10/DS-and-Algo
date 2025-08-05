class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0;i<n;i++){
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
        
    }
}
// Commit timestamp: 2024-12-02 12:51:00