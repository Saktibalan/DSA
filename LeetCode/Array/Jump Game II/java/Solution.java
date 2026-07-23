class Solution {
    public int jump(int[] nums) {
        return count(nums, 0, 0);
    }

    public int count(int nums[], int st , int end) {
        if (end >= nums.length - 1) {
            return 0;
        }

        int newEnd = end;

        for (int i = st; i <= end; i++) {
            newEnd = Math.max(newEnd, nums[i] + i);
        }

        return 1 + count(nums, end + 1, newEnd);
    }
}