class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n<=3) return 0;
        int d1 = nums[n-4] - nums[0];
        int d2 = nums[n-1] - nums[n-3];
        int d3 = nums[n-2] - nums[2];
        int d4 = nums[n-3] - nums[1];

        // int min = Math.min(d4,(Math.min(d3,(Math.min(d1,d2)))));
        int m1 = Math.min(d1,d2);
        int m2 = Math.min(d4,d3);

        return Math.min(m1,m2);


    }
}