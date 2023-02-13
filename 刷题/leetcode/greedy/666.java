class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean changed = false; //No element have been changed
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){   // if already sorted, move next
                continue;
            }
            if(changed) return false;   //if one change already made, return fals
            if(i == 0 || nums[i-1] <= nums[i+1]){//if idx-1 <= idx+1 or idx == 0
                nums[i] = nums[i+1];    //then val[idx] = val[idx+1] i.e reduce val[idx]
            }
            else{
                nums[i+1] = nums[i];    //else increase
            }
            
            changed = true; // since you made a change, count it
        }
        return true;
    }
}