class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isValid(nums, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isValid(int[] nums, int start, int end) {
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < start; i++) {
            if (nums[i] <= prev) {
                return false;
            }
            prev = nums[i];
        }

        prev = start == 0 ? Integer.MIN_VALUE : nums[start - 1];
        for (int i = end + 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                return false;
            }
            prev = nums[i];
        }

        return true;
    }
}
