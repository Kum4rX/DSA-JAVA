class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
       int countOfDigits = 0;
       
       for (int i = 0; i < nums.length; i++){
        while (nums[i]!=0){
            nums[i]= nums[i]/10;
            countOfDigits++;
        }
        if(countOfDigits%2 == 0){
            count++;
        }
        countOfDigits = 0;
       }
       return count;
    }
    
}