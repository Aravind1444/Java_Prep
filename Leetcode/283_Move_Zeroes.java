class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;                                        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];                      //if it's not a zero, then number will be shifted to the previous index after skiping the zeroes
            }
        }
        for(int i = index; i<nums.length; i++){
            nums[i] = 0;                                      // adding the remaining items as zeroes => considerable as moving zeroes or appending at last to match array length
        }
    }
}
