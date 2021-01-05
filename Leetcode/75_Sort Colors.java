class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;
        
        while(mid <= high){
            switch (nums[mid]){
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
        
    }
}

//This approach or algorithm is called Dutch National Flag Algorithm. It uses 3 pointers set at various locations. 

//Time Complexity  : O(n)
//Space Complexity : O(1)
