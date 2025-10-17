class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int cent = (i + j) / 2; 

            if (target == nums[cent]) {
                return cent; 
            } else if (target < nums[cent]) {
                j = cent - 1; 
            } else {
                i = cent + 1;
            }
        }
        return -1;
  
    }
}
