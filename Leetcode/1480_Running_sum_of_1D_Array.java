class Solution {
    public int[] runningSum(int[] nums) {
    
        int[] result = new int[nums.length];      //initializing new array of the same length as the input
        result[0] = nums[0];                      //assigning the first value of the new array as the same of input array
        for(int i = 1; i < nums.length; i++){
            result[i] = nums[i] + result[i-1];    // each element in the new array is the sum of all the elements of the input array till that index
        }
        return result;
        
    }
}
