class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = nums[0];                         //assigning initial value
        int fast = nums[0];                         //assigning initial value 
        do{
            slow = nums[slow];                      //jumps value one at a time
            fast = nums[nums[fast]];                //jumps valueu two at a time     => both when they're not equal
        } while(slow != fast);
        
        fast = nums[0];                             //once both slow and fast becomes value, either of one is set to the initial value / set to start from first index
        while(slow != fast){
            slow = nums[slow];                      //jumps one at a time
            fast = nums[fast];                      //jumps one at a time            => both when they're not equal
        }
        return slow;                                //once they're equal, it means the numbers are same and hence either slow or fast can be returned
        
    }
}



//Time complexity  : O(n)
//Space Complexity : O(1)
