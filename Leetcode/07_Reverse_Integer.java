//this contains the driver solution for the 7th question of leetcode : to reverse an integer


class Solution {
    public int reverse(int x) {
        
        boolean negative = false;
        if(x < 0){
            negative = true;
            x = x*-1;
        }                                                               //this is actually done to deal with the negative integers
        
        long reversed = 0;
        while(x > 0){
            reversed = reversed*10 + (x%10);
            x = x/10;                                                   //reversing the number
        }
        
        if(reversed > Integer.MAX_VALUE){
            return 0;
        }
        return negative? (int)(-1*reversed) : (int)(reversed);          //returning the number after adding a negative, if x was negative or else the positive number
        
    }
}


//number within the limit when reversed can overflow (19999 <<< 99991 concept)
