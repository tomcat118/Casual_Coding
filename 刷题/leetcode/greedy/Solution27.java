class Solution27 {
    // we only update pointer left when the current elment's not equal to val, and we set arr[left] = arr[right]
    public int removeElement(int[] nums, int val) {
        int left =0;
        for(int right =0; right<nums.length; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}