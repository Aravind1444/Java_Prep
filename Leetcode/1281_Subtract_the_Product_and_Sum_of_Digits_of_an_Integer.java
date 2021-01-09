class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        if(n == 0){
            return 0;
        }
        while(n != 0){
            sum = sum + (n%10);                       //Splitting the number into single digits (from back to front) by taking the remainder
            product = product * (n%10);
            n = n/10;                                 //Performing the division to get the next digit
        }
        return product - sum;
    }
}




//Time Complexity  : O(n)
//Space Complexity : O(1)
