class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int no_zero_index = 0;
        for (int num : nums){
            if (num != 0){
                nums[no_zero_index] = num;
                no_zero_index++;                
            }
        }
        while (no_zero_index < nums.length){
            nums[no_zero_index++] = 0;
        }
    }
}