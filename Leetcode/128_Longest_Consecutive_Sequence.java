class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int i : nums){
            hashSet.add(i);
        }
        
        int count = 0;
        
        for(int i : nums){
            if(!hashSet.contains(i-1)){
                int currentNum = i;
                int currentStreak = 1;
                
                while(hashSet.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                
                count = Math.max(count, currentStreak);
            }
        }
        
        return count;
        
    }
}