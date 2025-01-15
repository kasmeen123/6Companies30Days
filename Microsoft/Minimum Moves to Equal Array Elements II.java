class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;
        int moves = 0;
        for(int i = 0; i < n; i++) {
            if(n % 2 != 0) {
                moves += Math.abs(nums[i] - nums[n/2]);
            } 
            else {
                int mid = (nums[n/2] + nums[n/2 - 1]) / 2;
                moves += Math.abs(nums[i] - mid);
            }
        }
        return moves;
    }
}
