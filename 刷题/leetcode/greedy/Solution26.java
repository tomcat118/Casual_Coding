
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int left = 0; 
        
        for (int right =0; right<nums.length; right++){
            if(nums[right]!= nums[left]){
                left++;
                nums[left] = nums[right];
            }
        }
        
        return (left+1);
    }
}

