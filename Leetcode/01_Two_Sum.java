//This is a brute forcce approach having time complexity of O(n^2)

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


// Now, if we want to optimize our solution, we can use HashMap for the same and bring down time to O(n) from O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                    result[0] = i;
                    result[1] = map.get(difference); 
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
