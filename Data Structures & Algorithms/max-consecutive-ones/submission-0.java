class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0; // consecutive counter for num 1, starting at 0 (better to simplify to only look for num 1)
        int maxCount = 0; // counter for num 1 or 0 in the array, starting at 0

        for (int i = 0; i < nums.length; i++) { // for loop for array 
            if (nums[i] == 1) { // if index i equals 1, add it to the counter "count1"
                count1++;
                if (count1 > maxCount) { // if the counter "count1" is greater than then counter to find max number, 
                    maxCount = count1; // add it to this counter make the counter of num 1, equal to that total num counter
                }
            } else {
                count1 = 0; // else, consecutive counter for num 1 will reset to 0
            }
        }
        return maxCount;  // return num counter 
        // finished iterating, return maxCount of 3 
    }
}
