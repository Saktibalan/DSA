class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = searchPos(nums, target, false);
        int lastPos = searchPos(nums, target, true);
        return new int[] {firstPos, lastPos};
    }

    static int searchPos(int[] arr, int target, boolean findLastPos) {
        int s = 0;
        int e = arr.length-1;
        int pos = -1;
        while(s<=e) {
            int m = s + (e-s)/2;
            if(arr[m] > target) {
                e = m-1;
            } else if(arr[m] < target) {
                s = m+1;
            } else {
                pos = m;
                if(findLastPos == true) {
                    s = m+1;
                } else {
                    e = m-1;
                }
            }
        }
        return pos;
    }
}