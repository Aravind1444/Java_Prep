class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];                                 //we know that, the answer array will be having only 2 items since there will be only one pair of solution to meet target
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    arr[0] = i;
                    arr[1] = j;                                 //assigned values as index of those numbers which when added becomes the target number
                }
            }
        }
        return arr;
    }
}
