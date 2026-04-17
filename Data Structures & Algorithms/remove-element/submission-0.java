class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            // if index of array does not equal val,
            if (nums[i] != val) {
              // copy non-val elemnt to position k
                nums[k] = nums[i];
                k++;
            }
            // If nums[i] == val, we skip it (do nothing)
    }
      return k; // return here, k is the count of non-val elements
    }
}
